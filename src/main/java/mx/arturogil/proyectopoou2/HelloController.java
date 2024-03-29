package mx.arturogil.proyectopoou2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void helloWorld() {
        System.out.println("HELLO WORLD");
    }

    public void otherMethod() {
        System.out.println("I'm doing other stuff");
    }
}