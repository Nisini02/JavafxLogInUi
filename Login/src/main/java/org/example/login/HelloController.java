package org.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() {
        welcomeText.setText("User not found!");
    }
}