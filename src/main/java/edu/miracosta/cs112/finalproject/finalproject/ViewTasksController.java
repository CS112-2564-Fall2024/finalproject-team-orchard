package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewTasksController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label taskName;

    @FXML
    private Label taskDescription;

    private Task task; // To hold the selected task

    // Set the task to be displayed
    public void setTask(Task task) {
        this.task = task;
        // Update the labels with the task's details
        taskName.setText(task.getTitle());
        taskDescription.setText(task.getDescription());
    }

    // Handle the return action to close the window
    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }
}
