package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomerPanelController implements Initializable {

    @FXML
    private Text UserName;
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


    public static String Id = "1";
    public static String name = "Saad";


    public CustomerPanelController() throws FileNotFoundException {
    }

    @FXML
    void AppointmentButton(ActionEvent event) {

    }

    @FXML
    void LogoutButton(ActionEvent event) throws IOException {
        new General_Functions().switchScene(event, "LogInForm.fxml");
    }

    @FXML
    void MenuButton(KeyEvent event) {

    }

    @FXML
    void close(ActionEvent event) throws FileNotFoundException {
        new General_Functions().close(closebutton);
    }

    @FXML
    void minimize(ActionEvent event) throws FileNotFoundException {
        new General_Functions().minimize(minimizebtn);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            Changefxml MakeAnAppointment = new Changefxml();
            MakeAnAppointment.getfxml("MakeAnAppointment.fxml");
            UserName.setText(name);
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
