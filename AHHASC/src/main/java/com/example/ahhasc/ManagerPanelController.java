package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ManagerPanelController {


    CustomerSignUp_Controller obj = new CustomerSignUp_Controller();
    double x=0, y=0;
    @FXML
    private AnchorPane Main;

    @FXML
    private Text UserName;

    @FXML
    private Button closebutton;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> email2;

    @FXML
    private TableColumn<?, ?> fname;

    @FXML
    private TableColumn<?, ?> fname1;

    @FXML
    private TableColumn<?, ?> lname;

    @FXML
    private TableColumn<?, ?> lname2;

    @FXML
    private Button minimizebtn;

    @FXML
    private TableColumn<?, ?> nic;

    @FXML
    private TableColumn<?, ?> nic2;

    @FXML
    private TableColumn<?, ?> phon2;

    @FXML
    private StackPane stckPane;

    public ManagerPanelController() throws FileNotFoundException {
    }

    @FXML
    void AppointmentButton(ActionEvent event) {

    }

    @FXML
    void LogoutButton(ActionEvent event) throws IOException {
        new General_Functions().switchScene(event, "LoginFormManager.fxml");
    }

    @FXML
    void MenuButton(KeyEvent event) {

    }

    @FXML
    void close(ActionEvent event) throws FileNotFoundException {
        new General_Functions().close(closebutton);
    }

    @FXML
    void dragWindow(MouseEvent e) {
        obj.stage = (Stage) Main.getScene().getWindow();
        obj.stage.setX(e.getScreenX()-x);
        obj.stage.setY(e.getScreenY()-y);
    }

    @FXML
    void minimize(ActionEvent e) throws FileNotFoundException {
        new General_Functions().minimize(minimizebtn);
    }

    @FXML
    void pressedWindow(MouseEvent e) {
        x = e.getSceneX();
        y= e.getSceneY();
    }

}
