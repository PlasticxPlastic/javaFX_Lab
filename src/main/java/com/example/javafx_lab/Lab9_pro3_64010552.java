package com.example.javafx_lab;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.util.Random;


public class Lab9_pro3_64010552 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Random rand = new Random();
        int hour = rand.nextInt(12);
        int minute = rand.nextInt(2);
        if(minute == 1)
            minute = 30;
        int second = 0;
        ClockPane clock = new ClockPane(hour,minute,second);
        clock.setHourHandVisible(true);
        clock.setMinuteHandVisible(true);
        clock.setSecondHandVisible(false);
        String timeString = hour + ":" + minute
                + ":" + second;
        Label lblCurrentTime = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Lab9_pro3_64010552");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}