package com.example.ahhasc;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MakeAnAppointmentController {

    @FXML
    private AnchorPane AirConditionerPane;

    @FXML
    private AnchorPane CleanersPane;

    @FXML
    private AnchorPane ElectricianPane;

    @FXML
    private AnchorPane PlumberPane;

    @FXML
    void AirConditionerPaneButton(MouseEvent event) throws IOException {
        AppointmentCardController.CATEGORY = "Air Conditioner Service";
        AppointmentCardController.ITEM = "1 x A.C";
        AppointmentCardController.PRICE = "20 $ / AC";
        new General_Functions().switchSceneModality("AppointmentCard.fxml");
    }

    @FXML
    void CleanersPaneButton(MouseEvent event) throws IOException {
        AppointmentCardController.CATEGORY = "Cleaning Service";
        AppointmentCardController.ITEM = "1 x Pool";
        AppointmentCardController.PRICE = "20 $ / Pool";
        new General_Functions().switchSceneModality("AppointmentCard.fxml");
    }

    @FXML
    void ElectricianPaneButton(MouseEvent event) throws IOException {
        AppointmentCardController.CATEGORY = "Electrician Service";
        AppointmentCardController.ITEM = "1 x Refrigerator";
        AppointmentCardController.PRICE = "20 $ / Refrigerator";
        new General_Functions().switchSceneModality("AppointmentCard.fxml");
    }

    @FXML
    void PlumberPaneButton(MouseEvent event) throws IOException {
        AppointmentCardController.CATEGORY = "Plumbing Service";
        AppointmentCardController.ITEM = "1 x Toilet/Kitchen";
        AppointmentCardController.PRICE = "20 $ / Toilet/Kitchen";
        new General_Functions().switchSceneModality("AppointmentCard.fxml");
    }

}
