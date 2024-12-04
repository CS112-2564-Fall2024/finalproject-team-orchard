package edu.miracosta.cs112.finalproject.finalproject;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static List<Task> tasks = new ArrayList<>();

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static List<Task> getTasks() {
        return tasks;
    }
    public static void removeTask(Task task) {
        tasks.remove(task);
    }
}
