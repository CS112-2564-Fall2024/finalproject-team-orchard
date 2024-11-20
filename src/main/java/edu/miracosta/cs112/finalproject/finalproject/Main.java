package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/edu/miracosta/cs112/finalproject/finalproject/Calendar.fxml"));
            AnchorPane root = loader.load();

            // Set the title of the stage (window)
            primaryStage.setTitle("Calendar Application");

            // Create the scene with the loaded FXML and set it on the stage
            Scene scene = new Scene(root, 1050, 850);
            primaryStage.setScene(scene);

            // Show the stage
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading FXML file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}
