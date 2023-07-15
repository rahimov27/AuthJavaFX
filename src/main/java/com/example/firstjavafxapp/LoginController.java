package com.example.firstjavafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

import static java.lang.String.valueOf;
import static javafx.fxml.FXMLLoader.load;

public class LoginController {
    @FXML
    Button cancelButton;
    @FXML
    Button loginButton;
    @FXML
    TextField usernameTextField;
    @FXML
    PasswordField passwordPasswordField;
    @FXML
    Button registerButton;


    ArrayList<String> myList = new ArrayList<String>();

    //CancelButtonActionEvent
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    //LoginButtonEvent

    public void loginButtonOnAction(ActionEvent e){

    }

    public void registerButtonOnAction(ActionEvent e) {


    }


}