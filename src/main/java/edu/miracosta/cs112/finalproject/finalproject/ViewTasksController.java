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

    private Task task;
    public void setTask(Task task) {
        this.task = task;
        taskName.setText(task.getTitle());
        taskDescription.setText(task.getDescription());
    }
    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }
}
