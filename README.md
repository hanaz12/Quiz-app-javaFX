# Quiz Application

## Description
This project is a simple quiz application built using JavaFX. It allows users to answer a series of multiple-choice questions, track their correct answers, and display the final score at the end. 
The application has a straightforward user interface with three main scenes: a home screen, a quiz question screen, and a final score screen.

## Features
- **Home Screen**: A start button to begin the quiz.
- **Quiz Screen**: Displays multiple-choice questions, tracks user selections, and moves to the next question.
- **Final Score Screen**: Shows the total score and provides an option to exit the application.

## Project Structure
The project is organized into the following files and directories:

### Java Classes
- **`Quiz.java`**: The main class that launches the JavaFX application and displays the home screen.
- **`homeScreenController.java`**: Controls the logic for the home screen, handling the transition to the quiz question scene.
- **`QuistionsController.java`**: Manages the display of questions and answers, tracks user responses, and transitions to the final score screen.
- **`FinalScoreController.java`**: Displays the final score and handles the exit functionality.
- **`QuestionsAndAnswers.java`**: Stores the questions, answer choices, and correct answers. Provides methods for retrieving this information.

### FXML Files
- **`homeScreen.fxml`**: Defines the layout of the home screen with the "Start" button.
- **`Quistions.fxml`**: Defines the layout for displaying quiz questions and multiple-choice options.
- **`FinalScore.fxml`**: Defines the layout for displaying the final score.

## How to Run
1. Clone the repository or download the project files.
2. Open the project in your favorite Java IDE (e.g., IntelliJ, NetBeans, or Eclipse).
3. Make sure you have JavaFX set up in your environment.
4. Run the `Quiz` class to start the application.

## Usage
1. **Start the Quiz**: Click the "START" button on the home screen to begin the quiz.
2. **Answer Questions**: Select one of the multiple-choice options and click "Next" to proceed.
3. **View Final Score**: After answering all questions, the final score is displayed. Click "Exit" to close the application.
