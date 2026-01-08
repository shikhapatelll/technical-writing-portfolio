# Scrabble Word Finder & Scoring Engine — XML/DITA Documentation 

This repo is a **technical writing portfolio sample** showing how to document a small Java module using **DITA (XML)** and a docs-as-code workflow.

## What the module does
Given a **7-tile rack**, the module:
- Generates all dictionary-valid words that can be spelled from the rack
- Returns the Scrabble point values for those words (scores returned sorted ascending)


### DITA structure
- `dita/concept/` — overview + concepts
- `dita/task/` — quick start, tests, troubleshooting
- `dita/reference/` — API reference, scoring + data dependency

## Quick start (code)
1. Put these files in the same working directory:
   - `src/Scrabble.java`
   - `src/Tile.java`
   - `data/CollinsScrabbleWords2019.txt`
2. Compile:
   ```bash
   javac -d out src/Tile.java src/Scrabble.java
   ```
3. (Optional) Run sample tests:
   ```bash
   javac -d out -cp out tests/TestGame.java
   java -cp out TestGame
   ```

## Notes
- The dictionary file name is currently hard-coded as `CollinsScrabbleWords2019.txt`. (See `src/Scrabble.java`.)
- This project focuses on **first-turn scoring only** (no board bonuses, cross-words, or placement constraints).

## License / attribution
This repo contains coursework code and a dictionary file used for educational purposes.
