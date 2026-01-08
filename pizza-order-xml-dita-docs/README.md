# Pizza Ordering CLI & Receipt Generator — XML (DITA) Documentation 

This repository is a **technical writing portfolio sample** that documents a small Python command-line pizza ordering program and its receipt generator.

## What this shows 
- Structured **XML documentation** using **DITA** (Concept / Task / Reference topics)
- A **DITA map** (`.ditamap`) that assembles topics into a user/developer guide
- Docs-as-code structure for Git/GitHub (versioning, changelog)

## Repository layout
- `dita/` — DITA XML topics
- `maps/` — DITA map(s)
- `src/` — source code (`order.py`, `pizzaReceipt.py`, `test.py`)
- `spec/` — original technical reference (input flow + pricing + output format)

## Quickstart (run the CLI)
From the repo root:

```bash
python src/order.py
```

Follow the prompts to pick size (S/M/L/XL) and add toppings.
Use `LIST` to print available toppings and `X` to finish toppings for a pizza.
Enter `no` or `q` when finished to print the receipt.

## Run tests
```bash
python src/test.py
```



