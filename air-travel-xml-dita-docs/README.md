# Air Travel Module — XML (DITA) Documentation 

This repository is a **technical writing portfolio sample** that documents a small Python module for loading and querying airport/flight data.

## What this shows 
- **XML documentation** using **DITA** topics (Concept / Task / Reference)
- A **DITA map** to assemble the content
- A docs-as-code workflow (Git-friendly structure, changelog)

## Repository layout
- `dita/` — DITA XML topics (Concept/Task/Reference)
- `maps/` — DITA map(s)
- `src/` — Python module source (`Airport.py`, `Flight.py`, `Assign4.py`)
- `data/` — Sample datasets (`airports.txt`, `flights.txt`)

## Quickstart (run the module + tests)
1. Ensure Python **3.9+** is installed.
2. From the repo root:

```bash
python -m compileall src
python src/Asst4Tests.py
```

> The provided tests load `data/airports.txt` and `data/flights.txt`. If you run tests from another folder, adjust paths or run from repo root.


## Notes
- This is a portfolio sample based on a student assignment spec; the goal is to demonstrate **structured authoring**, clarity, and correct API/reference content.

