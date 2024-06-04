package com.exercises.loginapp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label errorPassword;

    @FXML
    private Label errorUsername;

    @FXML
    private TextField inputPassword;

    @FXML
    private TextField inputUsername;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblUsername;

    private final int MIN_LENGTH_PASSWORD = 7;

    @FXML
    void doCheckPassword(KeyEvent event) {
        String inputText = inputPassword.getText().trim();

        if(inputText.length() < MIN_LENGTH_PASSWORD || !hasNumber(inputText) || !hasMixedCase(inputText) || !hasSpecialChar(inputText)){
            errorPassword.setText("Password non valida!");
        }else {
            errorPassword.setText("");
        }
    }

    // Verifica se la stringa contiene caratteri speciali [!,?,@,#]
    private static boolean hasSpecialChar(String inputText) {
        boolean hasSpecialChar = inputText.matches(".*[!?@#].*");
        // System.out.println("String: " + (hasSpecialChar ? "hasSpecialChar" : "noSpecialChar")); //debug
        return hasSpecialChar;
    }

    // Verifica se la stringa ha numeri
    private static boolean hasNumber(String inputText) {
        boolean hasNumber = inputText.matches(".*[0-9].*");
        // System.out.println("String: " + (hasNumber ? "hasNumber" : "noNumber")); //debug
        return hasNumber;
    }

    // Verifica se la stringa ha sia caratteri maiuscoli che minuscoli
    private static boolean hasMixedCase(String inputText) {
        String lowerString = inputText.toLowerCase();
        String upperString = inputText.toUpperCase();
        boolean hasMixedCase = !inputText.equals(lowerString) && !inputText.equals(upperString);
        // System.out.println("String: " + (hasMixedCase ? "MultiCase" : "SingleCase")); //debug
        return hasMixedCase;
    }

    @FXML
    void doCheckUsername(KeyEvent event) {
        String inputText = inputUsername.getText().trim();
        if (inputText.isEmpty()) {
            errorUsername.setText("Username non valido!");
        } else {
            errorUsername.setText("");
        }
    }

    @FXML
    public void doLogin(ActionEvent actionEvent) {
        
    }

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

        errorUsername.setText("");
        errorPassword.setText("");

        assert errorPassword != null : "fx:id=\"errorPassword\" was not injected: check your FXML file 'main-view.fxml'.";
        assert errorUsername != null : "fx:id=\"errorUsername\" was not injected: check your FXML file 'main-view.fxml'.";
        assert inputPassword != null : "fx:id=\"inputPassword\" was not injected: check your FXML file 'main-view.fxml'.";
        assert inputUsername != null : "fx:id=\"inputUsername\" was not injected: check your FXML file 'main-view.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'main-view.fxml'.";
        assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'main-view.fxml'.";

    }


}
