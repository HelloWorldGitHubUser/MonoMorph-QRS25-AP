"""
RQ1 - Artifact Correctness: MonoMorph

Reads pre-computed artifact validation results and reproduces the results
reported in the paper:
  - Table 2: Artifact Correctness Rate (ACR) per application
  - Figure 7: Issue distribution by category and severity (stacked bar chart)
  - Table 3: Syntax issue sub-type counts

Background: the validation data was produced by manually reviewing every
code artifact emitted by the MonoMorph generation agent *before* the
correction workflow ran. The review results were classified and stored in
the combined-validated-results.csv file.

Input (../data/artifact_validation/):
  combined-validated-results.csv  -- per-issue rows for all reviewed artifacts

Output (printed to stdout / saved as PDF):
  LaTeX table: Artifact Correctness Rate (ACR) per application   (Table 2)
  PDF figure:  Issue distribution by category × severity          (Figure 7)
  LaTeX table: Syntax issue sub-type counts                       (Table 3)
"""

import os
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

DATA_DIR = "../data/artifact_validation"
FIGURE_PATH = "../data/artifact_validation/issue_distribution.pdf"

APP_LABELS = {
    "7ep-demo-2508061819-bce4":          "7ep Demo",
    "jpetstore-6-2507232035-7d27":       "JPetStore",
    "spring-petclinic-2507231543-0147":  "Spring Petclinic",
}

# Severity mapping applied during review:
#   "Critical" → paper "High"  (functionally breaking)
#   "High"     → paper "Low"   (non-blocking quality issue)
SEVERITY_MAP = {"Critical": "High", "High": "Low", "Minor": "Low"}

# ---------------------------------------------------------------------------
# Load data
# ---------------------------------------------------------------------------

df = pd.read_csv(f"{DATA_DIR}/combined-validated-results.csv")

# Keep only artifact-level rows (deduplicate key per run)
artifacts = df[["run_id", "key", "number_of_issues"]].drop_duplicates(subset=["run_id", "key"])

# Build issues DataFrame and remap severity
issues_df = df[df["number_of_issues"] > 0].copy()
issues_df["issue_severity"] = issues_df["issue_severity"].map(SEVERITY_MAP).fillna("Low")

# ---------------------------------------------------------------------------
# Table 2: Artifact Correctness Rate (ACR)
# ---------------------------------------------------------------------------

total     = artifacts.groupby("run_id")["key"].count()
correct   = artifacts[artifacts["number_of_issues"] == 0].groupby("run_id")["key"].count()
acr       = (correct / total).rename("ACR")

acr_df = acr.reset_index()
acr_df["run_id"] = acr_df["run_id"].replace(APP_LABELS)

# Append overall row (mean of per-app ACRs)
overall_acr = acr_df["ACR"].mean()
acr_df = pd.concat(
    [acr_df, pd.DataFrame({"run_id": ["Overall"], "ACR": [overall_acr]})],
    ignore_index=True,
)
acr_df = acr_df.rename(columns={"run_id": "Application"}).set_index("Application")
acr_df["ACR"] = acr_df["ACR"].apply(lambda x: f"{x * 100:.2f}\\%")

print("% ===== Table 2: Artifact Correctness Rate (ACR) per Application =====")
print(acr_df.T.to_latex(
    buf=None,
    column_format="l" + "c" * len(acr_df),
    index=True,
    header=True,
    bold_rows=True,
    escape=False,
    caption="Artifact Correctness Rate (ACR) per Application",
    label="tab-mm:artifact_correctness_rate",
))

# ---------------------------------------------------------------------------
# Figure 7: Issue distribution by category × severity
# ---------------------------------------------------------------------------

CATEGORY_LABELS = {
    "Following Instructions":    "Following\nInstructions",
    "Respecting Template":        "Respecting\nTemplate",
    "Syntax & Compilation Errors": "Syntax &\nCompilation\nErrors",
}

issues_df["issue_category_label"] = issues_df["issue_category"].map(CATEGORY_LABELS)

issue_pivot = (
    issues_df
    .groupby(["issue_category_label", "issue_severity"])
    .size()
    .unstack(fill_value=0)
    # Ensure consistent column order: High first, Low second
    .reindex(columns=["High", "Low"], fill_value=0)
)
# Row order matches the paper
category_order = ["Following\nInstructions", "Respecting\nTemplate", "Syntax &\nCompilation\nErrors"]
issue_pivot = issue_pivot.reindex(category_order, fill_value=0)

sns.set_theme(style="whitegrid")
palette = [sns.color_palette("Pastel1")[0], sns.color_palette("Pastel1")[2]]
hatches = ["/", "\\"]

ax = issue_pivot.plot(
    kind="bar",
    stacked=True,
    figsize=(10, 6),
    color=palette,
    edgecolor="grey",
)

for i, patch in enumerate(ax.patches):
    severity_index = i // len(issue_pivot)
    patch.set_hatch(hatches[severity_index % len(hatches)])

plt.ylabel("Count")
plt.xlabel("Issue Category")
plt.xticks(rotation=0)
plt.legend(title="Issue Severity")
sns.despine(left=True, bottom=True)
os.makedirs(os.path.dirname(FIGURE_PATH), exist_ok=True)
plt.savefig(FIGURE_PATH, bbox_inches="tight")
plt.show()
print(f"% Figure 7 saved to {FIGURE_PATH}")

# ---------------------------------------------------------------------------
# Table 3: Syntax issue sub-type counts
# ---------------------------------------------------------------------------

syntax_df = issues_df[issues_df["issue_category"] == "Syntax & Compilation Errors"].copy()
syntax_counts = syntax_df["syntax_issue_type"].value_counts().reset_index()
syntax_counts.columns = ["Syntax Issue Type", "Count"]
syntax_counts["Syntax Issue Type"] = (
    syntax_counts["Syntax Issue Type"]
    .str.replace("_", " ")
    .str.title()
    .replace({"Incomplete Source": "Incomplete Code"})
)
syntax_counts = syntax_counts.sort_values("Count", ascending=False).set_index("Syntax Issue Type")

print("% ===== Table 3: Syntax Issue Sub-type Counts =====")
print(syntax_counts.T.to_latex(
    buf=None,
    column_format="l" + "c" * len(syntax_counts),
    index=True,
    header=True,
    bold_rows=True,
    escape=False,
    float_format="%.0f",
    caption="Count of Syntax Issue Sub-types",
    label="tab-mm:syntax_issue_types",
))
