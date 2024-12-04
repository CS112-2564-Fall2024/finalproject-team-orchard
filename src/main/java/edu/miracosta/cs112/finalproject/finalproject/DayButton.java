package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Date;

public class DayButton extends Button {
    Date date;

    public DayButton(String s) {
        super(s);
    }

    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}


    public void setDate(int i, int i1, int day) {
    }
}
