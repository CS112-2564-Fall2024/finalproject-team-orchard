package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ListTasksController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ListView<String> taskListView;

    public void initialize() {
        // Populate the ListView with task titles from TaskManager
        for (Task task : TaskManager.getTasks()) {
            taskListView.getItems().add(task.getTitle());
        }
    }

    public void handleReturnToTaskViewer() {
        Stage stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }

    // Handle item click in ListView
    public void handleTaskClick(MouseEvent event) throws IOException {
        // Get the selected task title
        String selectedTaskTitle = taskListView.getSelectionModel().getSelectedItem();

        if (selectedTaskTitle != null) {
            // Find the task by title
            Task selectedTask = null;
            for (Task task : TaskManager.getTasks()) {
                if (task.getTitle().equals(selectedTaskTitle)) {
                    selectedTask = task;
                    break;
                }
            }

            if (selectedTask != null) {
                // Open a new window with task details
                openTaskDetailsWindow(selectedTask);
            }
        }
    }

    private void openTaskDetailsWindow(Task task) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ViewTasks.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("View Task");

        // Pass the selected task to the ViewTasksController
        ViewTasksController controller = fxmlLoader.getController();
        controller.setTask(task);

        stage.show();
    }
}
