package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewTasksController {
    @FXML
    AnchorPane anchorPane;
    public void handleReturnToTaskViewer(){
        Stage stage = (Stage)anchorPane.getScene().getWindow();
        stage.close();

    }
}
