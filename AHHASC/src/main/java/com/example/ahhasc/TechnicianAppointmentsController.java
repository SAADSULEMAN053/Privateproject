package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class TechnicianAppointmentsController {

    @FXML
    private Text CustomerName1;

    @FXML
    private Text CustomerName2;

    @FXML
    private Text CustomerName3;

    @FXML
    private Text Ph1;

    @FXML
    private Text Ph2;

    @FXML
    private Text Ph3;

    @FXML
    private Text status1;

    @FXML
    private Text status2;

    @FXML
    private Text status3;

    @FXML
    void paid1(ActionEvent event) {
        status1.setText("Completed");
    }

    @FXML
    void paid2(ActionEvent event) {
        status2.setText("Completed");
    }

    @FXML
    void paid3(ActionEvent event) {
        status3.setText("Completed");
    }

    @FXML
    void notpaid1(ActionEvent event) {
        status1.setText("Not Completed");
    }

    @FXML
    void notpaid2(ActionEvent event) {
        status2.setText("Not Completed");
    }

    @FXML
    void notpaid3(ActionEvent event) {
        status2.setText("Not Completed");
    }

}
