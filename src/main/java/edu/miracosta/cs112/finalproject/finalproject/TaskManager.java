package edu.miracosta.cs112.finalproject.finalproject;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static List<Task> tasks = new ArrayList<>();

    // Method to add a task to the list
    public static void addTask(Task task) {
        tasks.add(task);
    }

    // Method to get all tasks
    public static List<Task> getTasks() {
        return tasks;
    }
}
