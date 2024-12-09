package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class RemoveTasksController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ListView<CheckBox> taskListView;

    public void initialize() {
        for (Task task : TaskManager.getTasks()) {
            CheckBox checkBox = new CheckBox(task.getTitle());
            taskListView.getItems().add(checkBox);
        }
    }
    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }
    public void handleRemoveTasks() {
        List<Task> tasksToRemove = new ArrayList<>();
        for (CheckBox checkBox : taskListView.getItems()) {
            if (checkBox.isSelected()) {
                String taskTitle = checkBox.getText();
                Task taskToRemove = null;
                for (Task task : TaskManager.getTasks()) {
                    if (task.getTitle().equals(taskTitle)) {
                        taskToRemove = task;
                        break;
                    }
                }
                if (taskToRemove != null) {
                    tasksToRemove.add(taskToRemove);
                }
            }
        }
        TaskManager.getTasks().removeAll(tasksToRemove);
        taskListView.getItems().clear();
        initialize();
    }
}
