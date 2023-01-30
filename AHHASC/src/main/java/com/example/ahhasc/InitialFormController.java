package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InitialFormController {

    CustomerSignUp_Controller obj= new CustomerSignUp_Controller();
    double x=0,y=0;
    @FXML
    private AnchorPane Main;
    @FXML
    private Button Closebtn;
    @FXML
    private MenuButton SignUpButton;
    @FXML
    private MenuButton LogInButton;

    public InitialFormController() throws FileNotFoundException {
    }


    @FXML
    void closeBtn(ActionEvent event) throws FileNotFoundException {
        new General_Functions().close(Closebtn);
    }
    @FXML
    void CustomerLogInBtn(ActionEvent event) throws IOException {

        new General_Functions().switchScene(LogInButton,"LogInForm.fxml");
    }

    @FXML
    void CustomerSignUpBtn(ActionEvent event) throws IOException {
        new General_Functions().switchScene(SignUpButton,"Customer_SignUp.fxml");
    }

    @FXML
    void ManageLogInBtn(ActionEvent event) throws IOException {
            new General_Functions().switchScene(LogInButton, "LogInFormTechnician.fxml");
    }

    @FXML
    void TechnicianLogInBtn(ActionEvent event) throws IOException {
        new General_Functions().switchScene(LogInButton, "LogInFormTechnician.fxml");
    }

    @FXML
    void TechnicianSignUpBtn(ActionEvent event) throws IOException {
        new General_Functions().switchScene(SignUpButton, "Technician_SignUp.fxml");
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
