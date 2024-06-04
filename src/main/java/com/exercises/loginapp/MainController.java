package com.exercises.loginapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField inputPassword;

    @FXML
    private TextField inputUsername;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblUsername;

    @FXML
    void onClickLblUsername(MouseEvent event) {
        inputUsername.requestFocus();
    }

    @FXML
    void onClickLblPassword(MouseEvent event) {
        inputPassword.requestFocus();
    }



    @FXML
    void initialize() {
        assert inputPassword != null : "fx:id=\"inputPassword\" was not injected: check your FXML file 'main-view.fxml'.";
        assert inputUsername != null : "fx:id=\"inputUsername\" was not injected: check your FXML file 'main-view.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'main-view.fxml'.";
        assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'main-view.fxml'.";

    }

}
