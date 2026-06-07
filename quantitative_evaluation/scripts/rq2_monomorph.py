"""
RQ2 - Refactoring Effort: MonoMorph

Reads pre-computed effort metrics and produces the LaTeX tables reported in the paper.

Input  (../data/effort_metrics/):
  monomorph_metrics.csv         -- raw per-microservice effort metrics
                                   (regenerate from monomorph_metrics.json via compute_rq2_monomorph.py)

Output (printed to stdout):
  LaTeX table: initial-run effort metrics
  LaTeX table: effort metrics excluding cosmetic commits
  LaTeX table: additional / manual-correction run metrics
"""

import pandas as pd
import numpy as np

DATA_DIR = "../data/effort_metrics"

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


APP_LABELS = {"spring-petclinic": "PetClinic", "jpetstore-6": "JPetStore", "7ep-demo": "7ep Demo"}

# ---------------------------------------------------------------------------
# Load data
# ---------------------------------------------------------------------------

df_raw = pd.read_csv(f"{DATA_DIR}/monomorph_metrics.csv")
metrics_df = extract_metrics(df_raw)
metrics_df["key"] = metrics_df.apply(
    lambda r: f"{r['benchmark']}/{r['app']}/{r['run_name']}/{r['microservice']}", axis=1
)
metrics_df = metrics_df.set_index("key")

# Mark failed runs
for _, row in metrics_df[~metrics_df.run_name.isin(["single_run", "excluding_bloated_commits"])].iterrows():
    for variant in ["single_run", "excluding_bloated_commits"]:
        k = f"{row['benchmark']}/{row['app']}/{variant}/{row['microservice']}"
        metrics_df.loc[k, "success_rate"] = False

metrics_df.loc["monomorph/spring-petclinic/extended_run_vets/vets", "success_rate"] = False

# ---------------------------------------------------------------------------
# Table 1: Initial run effort metrics
# ---------------------------------------------------------------------------

single = (
    metrics_df[metrics_df.run_name == "single_run"]
    .reset_index()
    .drop(columns=["key", "benchmark", "run_name", "GHC"])
)
overall = get_overall_row(single)
single = pd.concat([single, overall.to_frame().T], axis=0)

single[["commit_count", "TLOC", "GFC"]] = single[["commit_count", "TLOC", "GFC"]].astype(int)
single = single.rename(columns={"success_rate": "Success Rate", "commit_count": "Commit Count"})
single = single[["app", "microservice", "Success Rate", "Commit Count", "GLOC", "TLOC", "GFC", "GAR", "MAR"]]
single = single.reset_index(drop=True)
single["app"] = single["app"].replace(APP_LABELS)
single["microservice"] = single["microservice"].apply(str.title)
single["Success Rate"] = single["Success Rate"].apply(lambda x: f"{int(x*100)}\\%")
single = (
    single.rename(columns={"microservice": "Microservice", "app": "Application"})
    .set_index(["Application", "Microservice"])
    .style.format({
        "Commit Count": "{:,.0f}", "GLOC": "{:,.0f}", "TLOC": "{:,.0f}", "GFC": "{:,.0f}",
        "GAR": lambda x: x.replace("%", "\\%"),
        "MAR": lambda x: x.replace("%", "\\%"),
    })
)

print("% ===== Table 1: MonoMorph Initial Run Effort Metrics =====")
print(single.to_latex(
    hrules=True,
    label="tab-mm:single_run_metrics",
    caption="MonoMorph Correction Agent Initial Run Effort Metrics",
    position="htbp",
    column_format="ll|ccccccc",
))

# ---------------------------------------------------------------------------
# Table 2: Effort metrics excluding cosmetic commits
# ---------------------------------------------------------------------------

single2 = metrics_df[metrics_df.run_name == "single_run"].drop(columns=["benchmark", "run_name", "GHC"])
single2.index = single2.index.str.replace("single_run/", "")
without_bloat = metrics_df[metrics_df.run_name == "excluding_bloated_commits"].drop(columns=["benchmark", "run_name", "GHC"])
without_bloat.index = without_bloat.index.str.replace("excluding_bloated_commits/", "")

discarded = (single2["commit_count"] - without_bloat["commit_count"]).fillna(0)
single2.loc[without_bloat.index] = without_bloat
single2["discarded_commits"] = discarded
single2 = single2.reset_index(drop=True)
overall2 = get_overall_row(single2)
overall2["discarded_commits"] = single2["discarded_commits"].sum()
single2 = pd.concat([single2, overall2.to_frame().T], axis=0)

single2[["TLOC", "GFC"]] = single2[["TLOC", "GFC"]].astype(int)
single2 = single2.rename(columns={
    "success_rate": "Success Rate", "commit_count": "Commit Count", "discarded_commits": "Discarded Commits"
})
single2 = single2[["app", "microservice", "Success Rate", "Commit Count", "GLOC", "TLOC", "GFC", "GAR", "MAR", "Discarded Commits"]]
single2 = single2.reset_index(drop=True)
single2["app"] = single2["app"].replace(APP_LABELS)
single2["microservice"] = single2["microservice"].apply(str.title)
single2["Success Rate"] = single2["Success Rate"].apply(lambda x: f"{int(x*100)}\\%")
single2 = (
    single2.rename(columns={"microservice": "Microservice", "app": "Application"})
    .set_index(["Application", "Microservice"])
    .style.format({
        "Commit Count": "{:,.0f}", "GLOC": "{:,.0f}", "TLOC": "{:,.0f}", "GFC": "{:,.0f}",
        "Discarded Commits": "{:,.0f}",
        "GAR": lambda x: x.replace("%", "\\%"),
        "MAR": lambda x: x.replace("%", "\\%"),
    })
)

print("% ===== Table 2: MonoMorph Effort Metrics (Excluding Cosmetic Commits) =====")
print(single2.to_latex(
    hrules=True,
    label="tab-mm:without_bloat_metrics",
    caption="MonoMorph Correction Agent Initial Run Effort Metrics (Excluding 'Cosmetic' Commits)",
    position="htbp",
    column_format="ll|cccccccc",
))

# ---------------------------------------------------------------------------
# Table 3: Additional / manual-correction runs
# ---------------------------------------------------------------------------

additional = (
    metrics_df[metrics_df.run_name.isin(["order_manual", "extended_run_vets"])]
    .reset_index(drop=True)
    .drop(columns=["benchmark", "run_name", "GHC", "success_rate"])
)
additional[["TLOC", "GFC"]] = additional[["TLOC", "GFC"]].astype(int)
additional = additional.rename(columns={"commit_count": "Commit Count"})
additional = additional[["app", "microservice", "Commit Count", "GLOC", "TLOC", "GFC", "GAR", "MAR"]]
additional = additional.reset_index(drop=True)
additional["app"] = additional["app"].replace(APP_LABELS)
additional["microservice"] = additional["microservice"].apply(str.title)
additional = (
    additional.rename(columns={"microservice": "Microservice", "app": "Application"})
    .set_index(["Application", "Microservice"])
    .style.format({
        "Commit Count": "{:,.0f}", "GLOC": "{:,.0f}", "TLOC": "{:,.0f}", "GFC": "{:,.0f}",
        "GAR": lambda x: x.replace("%", "\\%"),
        "MAR": lambda x: x.replace("%", "\\%"),
    })
)

print("% ===== Table 3: Additional Run and Manual Correction Effort Metrics =====")
print(additional.to_latex(
    hrules=True,
    label="tab-mm:additional_effort_metrics",
    caption="Additional Run (PetClinic Vets) and Manual Correction (JPetStore Order) Effort Metrics",
    position="htbp",
    column_format="ll|cccccc",
))
