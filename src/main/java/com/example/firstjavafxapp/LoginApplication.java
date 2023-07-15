package com.example.firstjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        stage.setTitle("Login Form");
        stage.show();

        Scene scene = new Scene(root,550,400);
        stage.setScene(scene);


    }


}