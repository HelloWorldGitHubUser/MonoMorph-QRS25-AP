"""
Compute RQ2 - Refactoring Effort: MicroRefact (Baseline)

Parses the pre-computed MicroRefact metrics JSON and writes the summary CSV
used by rq2_microrefact.py to produce LaTeX tables.

Input  (../data/effort_metrics/):
  microrefact_metrics.json   -- raw per-microservice metrics from the refacteval pipeline

Output (../data/effort_metrics/):
  microrefact_metrics.csv    -- one row per (run, microservice) with all effort metrics

Usage:
  python compute_rq2_microrefact.py

Requirements: Python 3 with pandas.

Note: to re-run the refacteval pipeline that produced microrefact_metrics.json from
scratch, requires the refacteval library, Docker, and the generated microservice
repositories.
"""

import json
import pandas as pd

DATA_DIR = "../data/effort_metrics"

COLUMNS = [
    "benchmark", "app", "run_name", "microservice",
    "start_commit", "end_commit", "excluded_commits",
    "global_line_changes", "global_hunk_changes", "global_file_changes", "commit_count",
    "total_line_changes", "total_hunk_changes", "total_file_changes",
    "per_commit_line_changes", "per_commit_hunk_changes", "per_commit_file_changes",
    "global_new_artifacts_updated", "global_old_artifacts_updated", "global_new_artifacts_created",
    "total_new_artifacts_updated", "total_old_artifacts_updated", "total_new_artifacts_created",
    "per_commit_new_artifacts_updated", "per_commit_old_artifacts_updated", "per_commit_new_artifacts_created",
    "new_relevant_artifacts_updated", "old_relevant_artifacts_updated", "new_relevant_artifacts_created",
    "all_new_relevant_artifacts", "all_old_relevant_artifacts", "total_relevant_artifacts",
    "new_relevant_artifact_update_ratio", "old_relevant_artifact_update_ratio", "all_relevant_artifact_update_ratio",
]

# ---------------------------------------------------------------------------
# Parse JSON → rows
# ---------------------------------------------------------------------------

with open(f"{DATA_DIR}/microrefact_metrics.json") as f:
    json_data = json.load(f)

rows = []
for run_key, data in json_data.items():
    benchmark = data["benchmark"]
    app       = data["app"]
    run_name  = data["run_name"]
    for ms, results in data["results"].items():
        row = {
            "benchmark":        benchmark,
            "app":              app,
            "run_name":         run_name,
            "microservice":     ms,
            "start_commit":     results["start_commit"],
            "end_commit":       "HEAD",
            "excluded_commits": "///".join(results["metrics"]["configuration"]["excluded_commits"]),
        }
        cd = results["metrics"]["code_change_metrics"]
        re = results["metrics"]["refactoring_effort_metrics"]

        row["global_line_changes"]  = cd["global_metrics"]["gnlc"]
        row["global_hunk_changes"]  = cd["global_metrics"]["gnh"]
        row["global_file_changes"]  = cd["global_metrics"]["gnf"]
        row["commit_count"]         = cd["global_metrics"]["commit_count"]
        row["total_line_changes"]   = cd["total_metrics"]["total_nlc"]
        row["total_hunk_changes"]   = cd["total_metrics"]["total_nh"]
        row["total_file_changes"]   = cd["total_metrics"]["total_nf"]
        row["per_commit_line_changes"]  = cd["per_commit_averages"]["nlc_per_commit"]
        row["per_commit_hunk_changes"]  = cd["per_commit_averages"]["hunks_per_commit"]
        row["per_commit_file_changes"]  = cd["per_commit_averages"]["files_per_commit"]

        gm = re["global_metrics"]
        row["global_new_artifacts_updated"] = gm["new_artifacts_updated"]
        row["global_old_artifacts_updated"] = gm["old_artifacts_updated"]
        row["global_new_artifacts_created"] = gm["new_artifacts_created"]
        row["new_relevant_artifacts_updated"] = gm["new_relevant_artifacts_updated"]
        row["old_relevant_artifacts_updated"] = gm["old_relevant_artifacts_updated"]
        row["new_relevant_artifacts_created"] = gm["new_relevant_artifacts_created"]
        row["all_new_relevant_artifacts"]     = gm["all_new_relevant_artifacts_in_repo"]
        row["all_old_relevant_artifacts"]     = gm["all_old_relevant_artifacts_in_repo"]
        row["total_relevant_artifacts"]       = gm["total_relevant_artifacts_in_repo"]

        tm = re["total_metrics"]
        row["total_new_artifacts_updated"] = tm["total_new_artifacts_updated"]
        row["total_old_artifacts_updated"] = tm["total_old_artifacts_updated"]
        row["total_new_artifacts_created"] = tm["total_new_artifacts_created"]

        pc = re["per_commit_averages"]
        row["per_commit_new_artifacts_updated"] = pc["new_artifacts_updated_per_commit"]
        row["per_commit_old_artifacts_updated"] = pc["old_artifacts_updated_per_commit"]
        row["per_commit_new_artifacts_created"] = pc["new_artifacts_created_per_commit"]

        nra = row["all_new_relevant_artifacts"]
        ora = row["all_old_relevant_artifacts"]
        tra = row["total_relevant_artifacts"]
        row["new_relevant_artifact_update_ratio"] = (
            (row["new_relevant_artifacts_updated"] + row["new_relevant_artifacts_created"]) / nra
            if nra > 0 else 0
        )
        row["old_relevant_artifact_update_ratio"] = (
            row["old_relevant_artifacts_updated"] / ora if ora > 0 else 0
        )
        row["all_relevant_artifact_update_ratio"] = (
            (row["new_relevant_artifacts_updated"] + row["old_relevant_artifacts_updated"] + row["new_relevant_artifacts_created"]) / tra
            if tra > 0 else 0
        )
        rows.append(row)

df = pd.DataFrame(rows, columns=COLUMNS)

# ---------------------------------------------------------------------------
# Write CSV
# ---------------------------------------------------------------------------

out_path = f"{DATA_DIR}/microrefact_metrics.csv"
df.to_csv(out_path, index=False)
print(f"Written {len(df)} rows to {out_path}")
