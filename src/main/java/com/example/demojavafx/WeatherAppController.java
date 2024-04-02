package com.example.demojavafx;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WeatherAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}