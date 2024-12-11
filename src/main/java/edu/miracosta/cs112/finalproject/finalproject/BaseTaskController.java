package edu.miracosta.cs112.finalproject.finalproject;

import javafx.stage.Stage;

public abstract class BaseTaskController {

    protected Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public void closeWindow(Stage stage) {
        stage.close();
    }
}