"""
RQ3 - Test Outcome Equivalence: MonoMorph

Reads pre-computed test reports and produces the LaTeX table reported in the paper.

Input  (../data/test_reports/):
  monoliths.csv   -- test results for the original monolithic applications
  monomorph.csv   -- test results for MonoMorph-generated microservices

Output (printed to stdout):
  LaTeX table: test outcome equivalence results
"""

import pandas as pd

DATA_DIR = "../data/test_reports"

APP_LABELS = {"spring-petclinic": "PetClinic", "jpetstore-6": "JPetStore", "7ep-demo": "7ep Demo"}

# ---------------------------------------------------------------------------
# Load data
# ---------------------------------------------------------------------------

df_mono = pd.read_csv(f"{DATA_DIR}/monoliths.csv")
df_monomorph = pd.read_csv(f"{DATA_DIR}/monomorph.csv")

df_mono["test_fqn"] = df_mono.apply(
    lambda r: f"{r['app']}::{r['test_class']}::{r['test_method']}", axis=1
)
df_mono_indexed = df_mono.set_index("test_fqn")

df_monomorph["test_fqn"] = df_monomorph.apply(
    lambda r: f"{r['app']}::{r['test_class']}::{r['test_method']}", axis=1
)

# ---------------------------------------------------------------------------
# Compute per-microservice equivalence counts
# ---------------------------------------------------------------------------

rows = []
for app in df_monomorph["app"].unique():
    dft = df_monomorph[df_monomorph.app == app]
    for ms in dft["ms_name_or_monolith"].unique():
        dft2 = dft[dft.ms_name_or_monolith == ms]
        mono_statuses = df_mono_indexed.loc[dft2["test_fqn"], "status"]
        matching = (dft2["status"].values == mono_statuses.values).sum()
        passed   = (dft2["status"] == "passed").sum()
        total    = len(dft2)
        rows.append({
            "app": app,
            "ms_name_or_monolith": ms,
            "matching_tests_count": matching,
            "passed_tests_count":   passed,
            "total_test_count":     total,
            "fpr": matching / total if total > 0 else 0,
        })

df_summary = pd.DataFrame(rows)

# Add per-app and global Overall rows
overall_rows = []
for app in df_summary["app"].unique():
    dft = df_summary[df_summary.app == app]
    overall_rows.append({
        "app": app,
        "ms_name_or_monolith": "Overall",
        "matching_tests_count": dft["matching_tests_count"].sum(),
        "passed_tests_count":   dft["passed_tests_count"].sum(),
        "total_test_count":     dft["total_test_count"].sum(),
        "fpr": dft["matching_tests_count"].sum() / dft["total_test_count"].sum(),
    })
overall_rows.append({
    "app": "Overall",
    "ms_name_or_monolith": "Overall",
    "matching_tests_count": df_summary["matching_tests_count"].sum(),
    "passed_tests_count":   df_summary["passed_tests_count"].sum(),
    "total_test_count":     df_summary["total_test_count"].sum(),
    "fpr": df_summary["matching_tests_count"].sum() / df_summary["total_test_count"].sum(),
})

df_full = pd.concat([df_summary, pd.DataFrame(overall_rows)], ignore_index=True)

# Sort: apps alphabetically, Overall last within each group
df_full["_app_sort"] = df_full["app"].apply(lambda x: "zzz" if x == "Overall" else x)
df_full["_ms_sort"]  = df_full["ms_name_or_monolith"].apply(lambda x: "zzz" if x == "Overall" else x)
df_full = df_full.sort_values(["_app_sort", "_ms_sort"]).drop(columns=["_app_sort", "_ms_sort"])

# ---------------------------------------------------------------------------
# Format and print LaTeX table
# ---------------------------------------------------------------------------

latex_df = df_full.rename(columns={
    "app": "Application",
    "ms_name_or_monolith": "Microservice",
    "matching_tests_count": "Matching Tests",
    "passed_tests_count":   "Passed Tests",
    "total_test_count":     "Total Tests",
    "fpr": "FPR",
})
latex_df["Application"] = latex_df["Application"].replace(APP_LABELS)
latex_df["Microservice"] = latex_df["Microservice"].apply(str.title)
latex_df = latex_df.set_index(["Application", "Microservice"])
latex_df["FPR"] = latex_df["FPR"].apply(lambda x: f"{x*100:.1f}\\%")
latex_df = latex_df.style.format({
    "Matching Tests": "{:,.0f}",
    "Passed Tests":   "{:,.0f}",
    "Total Tests":    "{:,.0f}",
})

print("% ===== Table: Test Outcome Equivalence Results — MonoMorph =====")
print(latex_df.to_latex(
    hrules=True,
    label="tab-mm:test_results_monomorph",
    caption="Test Outcome Equivalence Results for MonoMorph Microservices",
    position="htbp",
    column_format="ll|cccc",
))
