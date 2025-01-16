# Basketball Player Statistics Management

## Overview
This Java application allows users to manage and analyze basketball player statistics through a menu-driven interface. The program demonstrates key object-oriented programming concepts and provides a dynamic way to interact with player data.

## Features
- **View Player Details**: Retrieve information such as name, age, jersey number, and total points scored.
- **Calculate Total Points**: Display the total points scored by a player over the last 5 games.
- **Update Player Scores**: Add or update points scored by a player in specific games.
- **Find Top Scorer**: Identify the player with the highest total points.

## Usage
1. Clone this repository:
   ```bash
   git clone https://github.com/caaseey/Basketball
   ```
2. Open the project in an IDE (e.g., NetBeans, IntelliJ IDEA).
3. Run the `AppLiga` class to start the program.
4. Follow the on-screen menu to interact with player data.

## Menu Options
- **[1] Consult Player**: Enter a player name to view their details.
- **[2] Total Points**: Enter a player name to see their total points scored.
- **[3] Add Player Points**: Update the points for a specific game by entering the game position (0-4).
- **[4] Top Scorer**: Display the player with the highest total points.
- **[0] Exit**: Quit the program.

## Code Structure
- **`AppLiga`**: Main class containing the menu and user interaction logic.
- **`Jugador`**: Player class that encapsulates attributes like name, age, jersey number, and scores. Includes methods for calculating total points and updating scores.

## Example Players
The program includes the following predefined players:
- LeBron James
- Stephen Curry
- Giannis Antetokounmpo

You can add more players by editing the `AppLiga` class.

## Requirements
- **Java Development Kit (JDK)** 8 or higher.

## Example Output
```
[1] Consult Player
[2] Total Points
[3] Add Player Points
[4] Top Scorer
[0] Exit
Option: 1
Enter player name: Stephen Curry
Player: Stephen Curry, Age: 35, Jersey: 30, Total Points: 215
```

## Author
- **Casey Cleto Belen**

## License
This project is licensed under the MIT License.
