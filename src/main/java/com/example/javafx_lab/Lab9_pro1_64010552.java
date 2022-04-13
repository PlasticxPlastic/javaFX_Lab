package com.example.javafx_lab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab9_pro1_64010552 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("File:img/CND.png")),0,0);
        pane.add(new ImageView(new Image("File:img/CN.png")),1,0);
        pane.add(new ImageView(new Image("File:img/US.png")),0,1);
        pane.add(new ImageView(new Image("File:img/UK.png")),1,1);

        Scene scene = new Scene(pane,600,600);
        primaryStage.setTitle("Lab9_pro1_64010552");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}