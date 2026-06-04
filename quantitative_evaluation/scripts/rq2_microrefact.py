"""
RQ2 - Refactoring Effort: MicroRefact (Baseline)

Reads pre-computed effort metrics and produces the LaTeX tables reported in the paper.

Input  (../data/effort_metrics/):
  microrefact_metrics.csv       -- raw per-microservice effort metrics

Output (printed to stdout):
  LaTeX table: effort metrics (all runs)
  LaTeX table: effort metrics excluding cosmetic commits (PetClinic*)

Note: to re-compute microrefact_metrics.csv from the git history, run
compute_rq2_microrefact.py (requires the refacteval library).
"""

import pandas as pd
import numpy as np

DATA_DIR = "../data/effort_metrics"

APP_LABELS = {"spring-petclinic": "PetClinic", "jpetstore-6": "JPetStore", "7ep-demo": "7ep Demo"}

MICROSERVICE_NAMES = {
    "7ep-demo":       {"0": "authentication", "1": "library",   "2": "mathematics", "3": "persistence"},
    "jpetstore-6":    {"0": "account",         "1": "catalog",   "2": "order"},
    "spring-petclinic": {"0": "customers",     "1": "vets",      "2": "visits"},
}

# ---------------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------------

def format_rate_col(row, generated=True):
    if generated:
        updated_col, all_col, rate_col = "new_relevant_artifacts_updated", "all_new_relevant_artifacts", "GAR-R"
    else:
        updated_col, all_col, rate_col = "old_relevant_artifacts_updated", "all_old_relevant_artifacts", "MAR-R"
    return (
        f"{int(row[updated_col])} of {int(row[all_col])} ({row[rate_col]*100:.1f}%)"
        if row[all_col] > 0
        else "0 of 0 (0.0%)"
    )


def extract_metrics(df):
    m = df.copy()
    m["success_rate"] = True
    m["GLOC"] = m["global_line_changes"]
    m["TLOC"] = m["total_line_changes"]
    m["GHC"]  = m["global_hunk_changes"]
    m["GFC"]  = m["global_file_changes"]
    m["GAR-R"] = np.where(m["all_new_relevant_artifacts"] > 0,
                          m["new_relevant_artifacts_updated"] / m["all_new_relevant_artifacts"], 0)
    m["MAR-R"] = np.where(m["all_old_relevant_artifacts"] > 0,
                          m["old_relevant_artifacts_updated"] / m["all_old_relevant_artifacts"], 0)
    m["GAR"] = m.apply(lambda r: format_rate_col(r, generated=True),  axis=1)
    m["MAR"] = m.apply(lambda r: format_rate_col(r, generated=False), axis=1)
    cols = [
        "benchmark", "app", "run_name", "microservice",
        "success_rate", "commit_count", "GLOC", "TLOC", "GHC", "GFC", "GAR", "MAR",
        "new_relevant_artifacts_updated", "all_new_relevant_artifacts", "GAR-R",
        "old_relevant_artifacts_updated", "all_old_relevant_artifacts", "MAR-R",
    ]
    return m[cols]


def get_overall_row(dfm):
    sum_cols    = ["new_relevant_artifacts_updated", "all_new_relevant_artifacts",
                   "old_relevant_artifacts_updated", "all_old_relevant_artifacts"]
    mean_cols   = ["success_rate", "GAR-R", "MAR-R"]
    median_cols = ["commit_count", "GLOC", "TLOC", "GFC"]
    row = pd.Series(["Overall", "Overall"] + [None] * (len(dfm.columns) - 2), index=dfm.columns)
    row[sum_cols]    = dfm[sum_cols].sum()
    row[mean_cols]   = dfm[mean_cols].mean()
    row[median_cols] = dfm[median_cols].median()
    row["GAR"] = format_rate_col(row, generated=True)
    row["MAR"] = format_rate_col(row, generated=False)
    return row


# ---------------------------------------------------------------------------
# Load and prepare data
# ---------------------------------------------------------------------------

df_raw = pd.read_csv(f"{DATA_DIR}/microrefact_metrics.csv")
metrics_df = extract_metrics(df_raw)
metrics_df["microservice"] = metrics_df["microservice"].astype(str)
metrics_df["key"] = metrics_df.apply(
    lambda r: f"{r['benchmark']}/{r['app']}/{r['run_name']}/{r['microservice']}", axis=1
)
metrics_df = metrics_df.set_index("key")

# ---------------------------------------------------------------------------
# Table 1: Manual run effort metrics (all apps)
# ---------------------------------------------------------------------------

manual = (
    metrics_df[metrics_df.run_name == "manual"]
    .reset_index()
    .drop(columns=["key", "benchmark", "run_name", "GHC"])
)
without_bloat_petclinic = (
    metrics_df[
        (metrics_df.run_name == "excluding_bloated_commits") |
        (metrics_df.app != "spring-petclinic")
    ]
    .reset_index()
    .drop(columns=["key", "benchmark", "run_name", "GHC"])
)

overall = get_overall_row(manual)
overall_wb = get_overall_row(without_bloat_petclinic)
overall_wb["app"]         = "Overall*"
overall_wb["microservice"] = "Overall*"

without_bloat_petclinic["app"] = without_bloat_petclinic["app"].apply(
    lambda x: "spring-petclinic-without-bloat" if x == "spring-petclinic" else x
)

combined = pd.concat([
    manual,
    overall.to_frame().T,
    without_bloat_petclinic[without_bloat_petclinic.app == "spring-petclinic-without-bloat"],
    overall_wb.to_frame().T,
], axis=0)

combined[["commit_count", "TLOC", "GFC"]] = combined[["commit_count", "TLOC", "GFC"]].astype(int)
combined = combined.rename(columns={"commit_count": "Commit Count"})

def map_ms_name(row):
    ms = str(row["microservice"])
    if ms.startswith("Overall"):
        return ms
    app_key = "spring-petclinic" if row["app"] == "spring-petclinic-without-bloat" else row["app"]
    name = MICROSERVICE_NAMES.get(app_key, {}).get(ms, ms)
    return name + ("*" if row["app"] == "spring-petclinic-without-bloat" else "")

combined["microservice"] = combined.apply(map_ms_name, axis=1)
combined = combined[["app", "microservice", "Commit Count", "GLOC", "TLOC", "GFC", "GAR", "MAR"]]
combined = combined.reset_index(drop=True)
combined["app"] = combined["app"].replace({
    "spring-petclinic-without-bloat": "PetClinic*",
    **APP_LABELS,
})
combined["microservice"] = combined["microservice"].apply(str.title)
combined = (
    combined.rename(columns={"microservice": "Microservice", "app": "Application"})
    .set_index(["Application", "Microservice"])
    .style.format({
        "Commit Count": "{:,.0f}", "GLOC": "{:,.0f}", "TLOC": "{:,.0f}", "GFC": "{:,.0f}",
        "GAR": lambda x: x.replace("%", "\\%"),
        "MAR": lambda x: x.replace("%", "\\%"),
    })
)

print("% ===== Table: MicroRefact Effort Metrics =====")
print(combined.to_latex(
    hrules=True,
    label="tab-mm:microrefact_rq2_results",
    caption="MicroRefact Effort Metrics",
    position="htbp",
    column_format="ll|cccccc",
))
