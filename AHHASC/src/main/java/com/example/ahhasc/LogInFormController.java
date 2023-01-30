package com.example.ahhasc;

import Database.DatabaseFunctions;
import ModelClasses.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LogInFormController implements Initializable {
    File file;
    ObjectInputStream os;
    Customer customer =  null;

    private String PASSWORD=" ";
    private String EMAIL=" ";
    @FXML
    private TextField EmailField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    void login(ActionEvent event) throws IOException {

        int i =0;
        if(EmailField.getText()!="" || PasswordField.getText()!="")
        {
            while(EmailField.getText().equals(EMAIL)==false && PasswordField.getText().equals(PASSWORD))
            {
                EMAIL=customers.get(i).getEmail();
                PASSWORD=customers.get(i).getPassword();
                i++;
            }

            CustomerPanelController.Id=customers.get(i).getNicNumber();
            CustomerPanelController.name=customers.get(i).getFirstName()+customers.get(i).getLastName();

            new General_Functions().switchScene(event, "CustomerPanel.fxml");

        }

    }
    @FXML
    void LoginButton(ActionEvent event) {



    }
    ArrayList<Customer> customers;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            filllist();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void filllist() throws SQLException {
        ResultSet Rset;
        Rset = DatabaseFunctions.getAllCustomers();
        customers = new ArrayList<>();
        while(Rset.next())
        {
            customers.add(new Customer(Rset.getString("FirstName"), "LastName", "Email", "Pass", "nic", "Gender"));
        }
    }
}
