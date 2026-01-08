# PawTopia - Virtual Pet Game

CS2212 - Software Engineering | Winter 2025 
Team 35 | Java 23 | Swing GUI | JSON Layouts | No External Libraries


## Setup & Running

### Requirements

- Java 23 or later
- Eclipse(preferred) or IntelliJ IDEA 
- External dependency for Unit test files - JUnit 5(all required files)

### Steps to Run

1. Clone the repository.
2. Open in Eclipse(preferred) or IntelliJ.
3. Set SDK to Java 23.
4. Add the External jar files required for Unit testing to the project file
5. Check the structure of the Folder and Packages 
6. Structure should look like this:-
PawTopiaGame
- src
  - pawtopia
    - Main.java
    - PetTopiaSystem.java
  - pawtopia.commands
    - Command.java
    - ExerciseCommand.java
    - FeedCommand.java
    - GiveAGiftCommand.java
    - GoToBedCommand.java
    - PlayCommand.java
    - TakeToVetCommand.java
  - pawtopia.gui
    - AccessibleScree.java
    - CommandRules.java
    - CommandType.java
    - GameOverScreen.java
    - GamePlayScreen.java
    - InventoryScreen.java
    - MainMenuScreen.java
    - MenuPanel.java
    - ParentalControlScreen.java
    - ParentalLimitationsScreen.java
    - ParentalStatsScreen.java
    - PetSelectionScreen.java
    - RevivePetScreen.java
    - SavedGamesScreen.java
    - SaveSlotComponent.java
    - Screen.java
    - SettingsScreen.java
    - StoreScreen.java
    - TutorialScreen.java
  - pawtopia.logic
    - SaveData.java
    - SaveManager.java
    - SettingsManager.java
    - SoundManager.java
    - SpriteManager.java
  - pawtopia.models
    - Inventory.java
    - Item.java
    - ItemType.java
    - Pet.java
    - PetState.java
    - PetType.java
    - SaveData.java
    - StatType.java
  - pawtopia.util
    - JSONLayoutParser.java
    - JSONUtil.java
    - LayoutLoader.java
    - SimpleJSON.java
    - TutorialTextExtractor.java
- resources
  - icons
  - images
  - json
  - saves
  - sounds
- README.md
If the IDE you are using has the above structure, it should work properly when "Run" the program.    
7. Run `Main.java`. (Will open a popup screen, with MainMenu screen, from which you can start playing game)
---

## Design & Architecture

### Architecture

- **MVC (Model-View-Controller)** for separation of logic, UI, and data
- **JSON-based layout engine** for screens (no hardcoded UI)
- **Stat decay system** using real-time ticks
- **Sound and sprite manager** utilities for reusable feedback

### Design Patterns Used

- **Factory Pattern** - for loading pets, sprites, sounds
- **Command Pattern** - to handle pet actions
- **State Pattern** - for dynamic pet behavior (e.g., Dead, Hungry)
- **Observer Pattern** - for stat updates and UI feedback
- **Strategy Pattern** - for different command behaviors
- **Singleton Pattern** - for system-wide managers

---

## Key Classes

| Class Name            | Responsibility                                      |
|-----------------------|------------------------------------------------------|
| `Pet`                 | Holds pet type, name, stats, and state              |
| `PetState` (Abstract) | Base for states like HungryState, AngryState        |
| `Command` (Interface) | Represents a user action (Feed, Sleep, etc.)        |
| `CommandManager`      | Executes and validates commands                     |
| `Inventory`           | Stores food/gift items and quantities               |
| `SaveManager`         | Handles saving/loading using JSON                   |
| `GamePlayScreen`      | Main UI with pet stats, commands, and inventory     |
| `MainMenuScreen`      | Initial screen with navigation options              |
| `ParentalControlScreen`| PIN entry, time limits, play stats, pet revival   |
| `SpriteManager`       | Loads pet state images                              |
| `SoundManager`        | Plays background music and sound effects            |

---

## Assets Used

- PNG images for pet states (happy, angry, sleeping, dead, etc.)
- PNG icons for GUI elements
- `.mp3/.au` for background music
- `.wav/.au` for command sound effects
- JSON files for screen layouts and buttons

> All assets are stored locally in `resources/`

---

## Testing

- Logic classes tested with **JUnit 5**
- Manual testing of GUI interactions
- Save/load tested for edge cases:
  - Pet revival
  - Stat decay handling
  - Command restrictions based on state

---

## Team Members

Medha,
Priya,
Shikha,
Vidhi,
Yuchen

---

## Project Source

This project was created for academic purposes at Western University.

---

## Resources Usage

Usage of images, sounds, icons in PawTopia package 

[](resources/images/catHappy.png)
[](resources/images/foxAngry.png) 
[](resources/images/Tutorial4.png) 
[](resources/sounds/BackgroundMusic.au) 
[](resources/icons/settings.png) 

---
