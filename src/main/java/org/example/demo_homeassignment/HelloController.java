package org.example.demo_homeassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button button1;

    public void setEN(ActionEvent actionEvent) {
        loadView(new Locale("en"));
    }

    public void setIR(ActionEvent actionEvent) {
        loadView(new Locale("IR"));
    }

    public void setJP(ActionEvent actionEvent) {
        loadView(new Locale("JP"));
    }

    public void loadView(Locale locale) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("bundle", locale));
        try {
            Object root = fxmlLoader.load();
            Stage s = (Stage) button1.getScene().getWindow();
            s.setScene(new Scene((Parent) root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void main() {
    }
}