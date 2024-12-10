package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.Date;
import java.util.Map;


public class TasksViewerController {
    @FXML
    AnchorPane anchorPane;


    public void handleViewTasks()throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ListTasks.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("List Tasks");
        stage.show();
    }
    public void handleAddTasks()throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddTasks.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Add Tasks");
        stage.show();

    }
    public void handleRemoveTasks()throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("RemoveTasks.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Remove Tasks");
        stage.show();
    }

    public void handleReturnToCalendar(){
        Stage stage = (Stage)anchorPane.getScene().getWindow();
        stage.close();

    }

    }




