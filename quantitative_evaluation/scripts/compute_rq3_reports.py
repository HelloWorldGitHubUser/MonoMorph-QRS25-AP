"""
Compute RQ3 - Test Outcome Equivalence: Report Parsing

Parses the raw Maven/Gradle Surefire-style XML test reports and writes the
summary CSVs used by rq3_monomorph.py and rq3_microrefact.py.

Input  (../data/test_reports/raw/):
  monoliths/{app}/TEST-*.xml              -- monolith test reports
  monomorph/{app}/{microservice}/TEST-*.xml   -- MonoMorph microservice test reports
  microrefact/{app}/{0,1,2,...}/TEST-*.xml    -- MicroRefact microservice test reports

Output (../data/test_reports/):
  monoliths.csv     -- one row per (app, test_class, test_method) for the monoliths
  monomorph.csv     -- one row per (app, microservice, test_class, test_method)
  microrefact.csv   -- one row per (app, microservice id, test_class, test_method)

Usage:
  python compute_rq3_reports.py

Requirements: Python 3 with pandas (standard library xml.etree for parsing).
"""

import os
import xml.etree.ElementTree as ET

import pandas as pd

RAW_DIR = "../data/test_reports/raw"
OUT_DIR = "../data/test_reports"

APPS = ["7ep-demo", "jpetstore-6", "spring-petclinic"]
COLUMNS = ["app", "ms_name_or_monolith", "test_class", "test_method", "status", "time"]


def get_test_status(testcase: ET.Element) -> str:
    if testcase.find("failure") is not None:
        return "failed"
    elif testcase.find("error") is not None:
        return "errored"
    elif testcase.find("skipped") is not None:
        return "skipped"
    return "passed"


def parse_report_dir(reports_dir: str) -> list[dict]:
    """Parse all TEST-*.xml files in a directory into per-test rows."""
    rows = []
    for file_name in sorted(os.listdir(reports_dir)):
        if not (file_name.startswith("TEST-") and file_name.endswith(".xml")):
            continue
        class_name = file_name[len("TEST-"):-len(".xml")]
        tree = ET.parse(os.path.join(reports_dir, file_name))
        root = tree.getroot()
        testsuite = root if root.tag == "testsuite" else root.find("testsuite")
        for testcase in testsuite.findall("testcase"):
            rows.append({
                "test_class": class_name,
                "test_method": testcase.get("name"),
                "status": get_test_status(testcase),
                "time": float(testcase.get("time", 0.0)),
            })
    return rows


# ---------------------------------------------------------------------------
# Monoliths
# ---------------------------------------------------------------------------

mono_rows = []
for app in APPS:
    for row in parse_report_dir(f"{RAW_DIR}/monoliths/{app}"):
        mono_rows.append({"app": app, "ms_name_or_monolith": "monolith", **row})

df_mono = pd.DataFrame(mono_rows, columns=COLUMNS)
df_mono.to_csv(f"{OUT_DIR}/monoliths.csv", index=False)
print(f"Written {len(df_mono)} rows to {OUT_DIR}/monoliths.csv")

# ---------------------------------------------------------------------------
# MonoMorph
# ---------------------------------------------------------------------------

monomorph_rows = []
for app in APPS:
    app_dir = f"{RAW_DIR}/monomorph/{app}"
    for ms in sorted(os.listdir(app_dir)):
        ms_dir = os.path.join(app_dir, ms)
        if not os.path.isdir(ms_dir):
            continue
        for row in parse_report_dir(ms_dir):
            monomorph_rows.append({"app": app, "ms_name_or_monolith": ms, **row})

df_monomorph = pd.DataFrame(monomorph_rows, columns=COLUMNS)
df_monomorph.to_csv(f"{OUT_DIR}/monomorph.csv", index=False)
print(f"Written {len(df_monomorph)} rows to {OUT_DIR}/monomorph.csv")

# ---------------------------------------------------------------------------
# MicroRefact
# ---------------------------------------------------------------------------

microrefact_rows = []
for app in APPS:
    app_dir = f"{RAW_DIR}/microrefact/{app}"
    for ms in sorted(os.listdir(app_dir)):
        ms_dir = os.path.join(app_dir, ms)
        if not os.path.isdir(ms_dir):
            continue
        for row in parse_report_dir(ms_dir):
            microrefact_rows.append({"app": app, "ms_name_or_monolith": ms, **row})

df_microrefact = pd.DataFrame(microrefact_rows, columns=COLUMNS)
df_microrefact.to_csv(f"{OUT_DIR}/microrefact.csv", index=False)
print(f"Written {len(df_microrefact)} rows to {OUT_DIR}/microrefact.csv")
