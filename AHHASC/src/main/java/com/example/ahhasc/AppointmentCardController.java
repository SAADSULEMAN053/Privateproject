package com.example.ahhasc;

import Database.DatabaseFunctions;
import ModelClasses.Appointment;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppointmentCardController implements Initializable {

    @FXML
    private Button cancel;
    @FXML
    private AnchorPane Main;
    double x=0,y=0;
    public static String CATEGORY,ITEM,OPTION1,OPTION2,PRICE;

    CustomerSignUp_Controller obj = new CustomerSignUp_Controller();
    @FXML
    private Text CategoryName;

    @FXML
    private Text ItemName;
    @FXML
    private Text PriceText;
    @FXML
    private MenuButton MenuButton;

    public AppointmentCardController() throws FileNotFoundException {
    }

    @FXML
    void MakeAnAppointmentButton(ActionEvent event) throws IOException {



    }

    @FXML
    void Option1Button(ActionEvent event) {

    }

    @FXML
    void Option2Button(ActionEvent event) {

    }

    @FXML
    void dragWindow(MouseEvent e) {
        obj.stage = (Stage) Main.getScene().getWindow();
        obj.stage.setX(e.getScreenX()-x);
        obj.stage.setY(e.getScreenY()-y);
    }

    @FXML
    void pressedWindow(MouseEvent e) {
        x = e.getSceneX();
        y= e.getSceneY();
    }

    @FXML
    void Cancelbutton(ActionEvent event) throws FileNotFoundException {
        new General_Functions().close(cancel);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CategoryName.setText(CATEGORY);
        ItemName.setText(ITEM);
        PriceText.setText(PRICE);

    }
}
