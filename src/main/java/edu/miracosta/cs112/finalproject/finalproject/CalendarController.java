package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarController {

    @FXML
    private GridPane calendarGrid;
    @FXML
    private Label monthName;

    private YearMonth currentMonth;

    // Constructor
    public CalendarController() {
        // Initialize with the current date
        currentMonth = YearMonth.now();
    }

    @FXML
    public void initialize() {
        // Debugging to check if this method is being called
        System.out.println("Initializing the calendar...");

        // Update month name
        monthName.setText(currentMonth.getMonth().name() + " " + currentMonth.getYear());

        // Clear previous buttons (if any)
        calendarGrid.getChildren().clear();

        // Get first day of the month and number of days
        LocalDate firstDayOfMonth = currentMonth.atDay(1);
        int daysInMonth = currentMonth.lengthOfMonth();

        // Get the day of the week for the first day of the month (1 = Monday, 7 = Sunday)
        int startDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

        // Adjust the day to match JavaFX Calendar (0 = Sunday, 6 = Saturday)
        if (startDayOfWeek == 7) {
            startDayOfWeek = 0;
        }

        // Add buttons dynamically based on the number of days in the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Calculate column (day of the week) and row (week number)
            int column = (startDayOfWeek + day - 1) % 7;
            int row = (startDayOfWeek + day - 1) / 7;

            Button dayButton = new Button(String.valueOf(day));
            dayButton.setPrefSize(148, 120);
            dayButton.setFont(new Font(18));
            dayButton.setAlignment(Pos.TOP_LEFT);
            dayButton.setPadding(new javafx.geometry.Insets(10, 10, 0, 10));

            // Add button to the grid at the appropriate row and column
            calendarGrid.add(dayButton, column, row);
        }
    }

    @FXML
    private void nextMonth() {
        // Debugging to check if nextMonth is working
        System.out.println("Next month button clicked");
        currentMonth = currentMonth.plusMonths(1);
        initialize();
    }

    @FXML
    private void backMonth() {
        // Debugging to check if backMonth is working
        System.out.println("Back month button clicked");
        currentMonth = currentMonth.minusMonths(1);
        initialize();
    }
}
