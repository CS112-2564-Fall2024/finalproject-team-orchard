package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewTasksController extends BaseTaskController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label taskName;

    @FXML
    private Label taskDescription;

    @Override
    public void setTask(Task task) {
        super.setTask(task);
        taskName.setText(task.getTitle());
        taskDescription.setText(task.getDescription());
    }

    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        closeWindow(stage);
    }
}