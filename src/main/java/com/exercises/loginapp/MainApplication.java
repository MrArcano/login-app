package com.exercises.loginapp;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Floating Placeholder TextField");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}