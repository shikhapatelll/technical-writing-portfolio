# Universities Ranking Analyzer — XML (DITA) Documentation 

This repository is a **technical writing portfolio sample** that documents a Python module that analyzes global university ranking data and writes a fixed-format report to `output.txt`.

## What this shows (
- **XML documentation** using **DITA** topics (Concept / Task / Reference)
- A **DITA map** that assembles topics into a guide
- Docs-as-code structure for Git/GitHub (versioning, changelog)

## Repository layout
- `dita/` — DITA XML topics
- `maps/` — DITA map(s)
- `src/` — Python module (`univRanking.py`) and test runner (`tester.py`)
- `data/` — sample CSV inputs and a sample `output.txt`

## Quickstart (run the analyzer)
From the repo root:

```bash
python src/tester.py
```

Or call the entry point directly:

```python
import univRanking
univRanking.getInformation("Japan", "data/TopUni.csv", "data/capitals.csv")
```


