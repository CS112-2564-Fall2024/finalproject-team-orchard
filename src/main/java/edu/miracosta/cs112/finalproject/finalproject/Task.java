package edu.miracosta.cs112.finalproject.finalproject;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date date;

    public Date getDate(){return date;}
    public void setDate(int day, int month, int year){date = new Date(year, month, day);
    }
    public Task(String title, String description) {
        this.title = title;
        this.description = description;

    }
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
