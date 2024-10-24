# Builder Task Description

In this project, I implemented a simple game that utilizes the Builder design pattern to create elemental characters for a combat scenario. The game allows users to choose between five elemental opponents: Fire, Water, Lightning, Earth, and Wind. The main class, Main, orchestrates the flow of the game and demonstrates the use of the Builder pattern to construct these characters dynamically.

Key Features
Elemental Selection: Players can choose two opponents from the available elements. The chosen elements are instantiated through a builder, making it easy to manage their properties and behaviors.

Builder Pattern Implementation: The Builder design pattern is used to separate the construction of complex objects (elements) from their representation. Each element is built based on the player's selection, allowing for a clean and maintainable code structure.

Combat Logic: The game compares the two selected elements to determine the winner based on their strengths and weaknesses. The outcome is displayed after a countdown, enhancing the user experience.

How It Works:
1. The user is prompted to select their first opponent.
2. After the first choice, the user is prompted to select a second opponent.
3. Each selected element is built using the getBuilder method of the Director class.
4. The game logic compares the two elements to determine the winner based on their respective strengths and weaknesses.
5. The results are displayed, and a message indicates whether it's a win for one of the elements or a draw.

# Conclusion

This implementation showcases the flexibility and power of the Builder design pattern in creating complex objects while maintaining code readability and separation of concerns. By using this pattern, the game can easily be extended to include additional elements or features in the future.
