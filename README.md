Project Overview

Crystal Compass is a Java-based recommendation application that helps users discover crystals based on their preferred color and desired symbolic intention.

The program compares user preferences against a predefined collection of crystals and recommends matches based on their colors and traditional symbolic associations.

This project was developed as an independent programming assignment to apply foundational Java programming and object-oriented design concepts to a practical problem.

Features

Personalized Recommendations: Accepts user input for a preferred crystal color and symbolic intention, such as calmness, confidence, clarity, or love.

Exact Matching: Recommends crystals that match both user preferences.

Alternative Recommendations: Suggests crystals matching either the selected color or intention when no exact match exists.

No-Match Handling: Displays an informative message when no suitable crystals are found.

Repeat Searches: Allows users to explore different combinations without restarting the application.

Crystal Descriptions: Displays traditional symbolic associations for recommended crystals.

Technologies Used

Programming Language: Java

Development Environment: Visual Studio Code

Data Structure: ArrayList

Programming Concepts: Object-oriented programming, encapsulation, constructors, getter methods, enhanced for loops, conditional statements, Boolean logic, and user input handling.

Project Structure

Crystal.java

Defines individual crystal objects and stores their names, colors, symbolic intentions, and descriptions. Uses private fields and public getter methods to implement encapsulation.

CrystalLibrary.java

Maintains the collection of crystal objects and implements the matching algorithm. Searches for exact and partial matches using loops and conditional statements.

CrystalCompass.java

Contains the main method and manages user interaction. Uses Scanner to collect preferences, displays recommendations, and allows repeated searches.

Disclaimer

Crystal recommendations are based on traditional and cultural symbolic associations. The application does not claim scientifically established healing or energy-related effects.

Author

Jaydi Gilstrap
