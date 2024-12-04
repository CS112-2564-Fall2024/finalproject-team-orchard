package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

public class CalendarController {

    @FXML
    private GridPane calendarGrid;
    @FXML
    private Label monthName;

    private YearMonth currentMonth;

    public CalendarController() {
        currentMonth = YearMonth.now();
    }


    @FXML
    public void initialize() {
        System.out.println("Initializing the calendar...");
        monthName.setText(currentMonth.getMonth().name() + " " + currentMonth.getYear());
        calendarGrid.getChildren().clear();
        LocalDate firstDayOfMonth = currentMonth.atDay(1);
        int daysInMonth = currentMonth.lengthOfMonth();
        // Get the day of the week for the first day of the month (1 = Monday, 7 = Sunday)
        int startDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        // Adjust the day to match JavaFX Calendar (0 = Sunday, 6 = Saturday)
        if (startDayOfWeek == 7) {
            startDayOfWeek = 0;
        }
        for (int day = 1; day <= daysInMonth; day++) {
            int column = (startDayOfWeek + day - 1) % 7;
            int row = (startDayOfWeek + day - 1) / 7;
            DayButton dayButton = new DayButton(String.valueOf(day));
            dayButton.setDate(new Date(2024, 12, day));
            dayButton.setOnAction(actionEvent -> {
                try {
                    handleDayButton(dayButton);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            dayButton.setPrefSize(148, 120);
            dayButton.setFont(new Font(18));
            dayButton.setAlignment(Pos.TOP_LEFT);
            dayButton.setPadding(new javafx.geometry.Insets(10, 10, 0, 10));
            calendarGrid.add(dayButton, column, row);
        }
    }

    public void handleDayButton(DayButton dayButton)throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TasksViewer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Task Viewer");
        stage.show();
        // todo: pass the date to the task viewer
        dayButton.getDate();

    }

    @FXML
    private void nextMonth() {
        System.out.println("Next month button clicked");
        currentMonth = currentMonth.plusMonths(1);
        initialize();
    }

    @FXML
    private void backMonth() {
        System.out.println("Back month button clicked");
        currentMonth = currentMonth.minusMonths(1);
        initialize();
    }
}
