package com.example.javafx_lab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Random;

public class Lab9_pro2_64010552 extends Application {

    @Override
    public void start(Stage primaryStage) {

        int SIZE = 10;
        int length = SIZE;
        int width = SIZE;

        GridPane pane = new GridPane();

        for(int y = 0; y < length; y++){
            for(int x = 0; x < width; x++){

                Random rand = new Random();
                int rand1 = rand.nextInt(2);

                TextField tf = new TextField();
                tf.setPrefHeight(50);
                tf.setPrefWidth(50);
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText(""+rand1);

                pane.setRowIndex(tf,y);
                pane.setColumnIndex(tf,x);
                pane.getChildren().add(tf);
            }
        }

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Lab9_pro2_64010552");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}