# JSON Save/Load Format (Portfolio Summary)

## Why JSON
- Human-readable and lightweight
- Supports hierarchical data (good match for object-style game state)
- Strong Java ecosystem support (for example Gson/Jackson)

## What should be stored
Typical save data for a virtual pet game includes:
- Player/profile info (name/id, preferences)
- Pet state (stats, inventory, progression)
- Game settings (difficulty, audio/visual settings, parental controls)

## Validation & error handling (writer’s checklist)
- Handle missing file / unreadable file
- Handle corrupted JSON (parse errors)
- Handle unsupported versions (add `schemaVersion`)
- Provide clear user-facing error messages and safe recovery paths

See original JSON rationale and notes: `source_pdfs/design/File_Format_JSON.pdf`.
