package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Main class to launch the Calendar Application.
 * <p>
 * This class is the entry point of the JavaFX application. It loads the
 * FXML layout for the calendar, sets up the primary stage, and displays
 * the calendar interface.
 * </p>
 */
public class Main extends Application {

    /**
     * Initializes the primary stage for the Calendar Application.
     * Loads the FXML file, sets the title, and shows the primary stage
     * with the defined scene.
     *
     * @param primaryStage The primary stage for this JavaFX application.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file for the calendar layout
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Calendar.fxml"));
            AnchorPane root = loader.load();

            // Set up the scene with the loaded layout and configure the stage
            primaryStage.setTitle("Calendar Application");
            Scene scene = new Scene(root, 1050, 850);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // Handle the error if the FXML file cannot be loaded
            e.printStackTrace();
            System.err.println("Error loading FXML file: " + e.getMessage());
        }
    }

    /**
     * The main entry point for the application.
     * This method launches the JavaFX application.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
