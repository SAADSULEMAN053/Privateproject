package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerPanelController implements Initializable {

    double x=0,y =0;
    CustomerSignUp_Controller obj = new CustomerSignUp_Controller();
    @FXML
    private AnchorPane Main;
    @FXML
    private Button closebutton;

    @FXML
    private Button minimizebtn;
    @FXML
    private StackPane stckPane;

    @FXML
    void AppointmentButton(ActionEvent event) {

    }

    @FXML
    void LogoutButton(ActionEvent event) {

    }

    @FXML
    void MenuButton(KeyEvent event) {

    }

    @FXML
    void close(ActionEvent event) {
        new General_Functions().close(closebutton);
    }

    @FXML
    void minimize(ActionEvent event) {
        new General_Functions().minimize(minimizebtn);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            Changefxml MakeAnAppointment = new Changefxml();
            MakeAnAppointment.getfxml("MakeAnAppointment.fxml");

            stckPane.getChildren().add(MakeAnAppointment.pane);

    }

    public void dragWindow(MouseEvent e)
    {
        obj.stage = (Stage) Main.getScene().getWindow();
        obj.stage.setX(e.getScreenX()-x);
        obj.stage.setY(e.getScreenY()-y);
    }
    @FXML
    public void pressedWindow(MouseEvent e)
    {
        x = e.getSceneX();
        y= e.getSceneY();
    }
}
