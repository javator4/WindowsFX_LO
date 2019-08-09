package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import pl.sda.windows.App;


public class RootController {

    @FXML
    private Button button1;
    @FXML
    private Button button2;

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    public void test(){
        System.out.println("Uruchomilem sie");
    }

    public void openWindow1(ActionEvent actionEvent) {

    }

    public void openWindow2(ActionEvent actionEvent) {
        this.app.loadTwoView();
    }
}
