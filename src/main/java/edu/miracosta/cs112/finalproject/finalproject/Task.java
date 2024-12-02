package edu.miracosta.cs112.finalproject.finalproject;

public class Task {
    private String title;
    private String description;

    // Constructor
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task: " + title + "\nDescription: " + description;
    }
}
