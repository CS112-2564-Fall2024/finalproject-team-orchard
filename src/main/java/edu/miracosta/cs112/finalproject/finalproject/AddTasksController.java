package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddTasksController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    TextField taskName;
    @FXML
    TextArea taskDescription;

    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }

    public void addToCalendar() {
        String title = taskName.getText();
        String description = taskDescription.getText();

        if (title.isEmpty() || description.isEmpty()) {
            System.out.println("Please enter both a task name and description.");
            return;
        }

        Task newTask = new Task(title, description);
        TaskManager.addTask(newTask);
        System.out.println("Added Task: " + newTask);

        taskName.clear();
        taskDescription.clear();
    }
}
