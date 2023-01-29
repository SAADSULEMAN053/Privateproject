package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerSignUp_Controller {
    Stage stage;
    Scene scene;

    String errorStyle = "-fx-border-color: #ff0000; -fx-border-width: 3px; -fx-background-radius:12px; -fx-border-radius:12px";
    String resetStyle = "-fx-border-color: transparent; -fx-border-width: 3px; -fx-background-radius:12px";

    String alphabetRegex = "^[a-zA-Z ]*$";
    String numericRegex = "^[0-9]*$";


    @FXML
    private RadioButton FemaleField;

    @FXML
    private TextField emailField;

    @FXML
    private Label emailValidation;

    @FXML
    private Label fNameValidation;

    @FXML
    private TextField firstnameField;

    @FXML
    private ToggleGroup g1;

    @FXML
    private Label genderValidation;

    @FXML
    private Label lNameValidation;

    @FXML
    private TextField lastnameField;

    @FXML
    private RadioButton maleField;

    @FXML
    private TextField nicField;

    @FXML
    private Label nicValidation;

    @FXML
    private Label passValidation;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField phoneNoField;

    @FXML
    private Label phoneNoValidation;

    @FXML
    private Button signUpCompleteButton;
    @FXML

    private Button close;

    private static String fName;
    private static String lName;
    private static String email;
    private static String phoneNo;
    private static String password;
    private static String gender;
    private static String nic;

    public void doneSignUp(ActionEvent e) throws IOException {
        fName = firstnameField.getText();
        lName = lastnameField.getText();
        email = emailField.getText();
        password = passwordField.getText();
        phoneNo = phoneNoField.getText();
        nic = nicField.getText();

        if(fName.isBlank() || fName.isEmpty()){
            fNameValidation.setText("! FirstName Cannot Be Empty");
            firstnameField.setStyle(errorStyle);
        }
        else if(fName.length() < 3){
            fNameValidation.setText("! FirstName Should Contain At-least Three Characters");
            firstnameField.setStyle(errorStyle);
        }
        else if (!fName.matches(alphabetRegex)) {
            fNameValidation.setText("! FirstName cannot contain Numbers");
            firstnameField.setStyle(errorStyle);
        }
        if(lName.isBlank() || lName.isEmpty()){
            lNameValidation.setText("! LastName Cannot Be Empty");
            lastnameField.setStyle(errorStyle);
        }
        else if(lName.length() < 3){
            lNameValidation.setText("! LastName Should Contain At-least Three Characters");
            lastnameField.setStyle(errorStyle);
        }
        else if (!lName.matches(alphabetRegex)) {
            lNameValidation.setText("! lastName cannot contain letters");
            lastnameField.setStyle(errorStyle);
        }
        if(email.isBlank() || email.isEmpty()){
            emailValidation.setText("! Email Cannot Be Empty");
            emailField.setStyle(errorStyle);
        }
        if(password.isBlank() || password.isEmpty()){
            passValidation.setText("! Password Cannot Be Empty");
            passwordField.setStyle(errorStyle);
        }
        else if(password.length() < 8){
            passValidation.setText("! Password Should Contain At-least Eight Characters");
            passwordField.setStyle(errorStyle);
        }
        try{
            if(gender.equals(null)){
                genderValidation.setText("! Select a Gender");
            }
        }
        catch (Exception e1){
            genderValidation.setText("! Select a Gender");
        }

        if (maleField.isSelected()){
            gender = "male";
        } else if (FemaleField.isSelected()) {
            gender = "female";
        }
        if(phoneNo.isBlank() || phoneNo.isEmpty()){
            phoneNoValidation.setText("! PhoneNumber cannot be empty");
            phoneNoField.setStyle(errorStyle);
        }
        else if (!phoneNo.matches(numericRegex)) {
            phoneNoValidation.setText("! PhoneNumber cannot contain letters");
            phoneNoField.setStyle(errorStyle);
        }
        else if(phoneNo.length() != 11){
            phoneNoValidation.setText("! PhoneNumber must contain exactly 11 digits");
            phoneNoField.setStyle(errorStyle);
        }
        if(nic.isBlank()){
            nicValidation.setText("! NIC cannot be cannot be empty");
            nicField.setStyle(errorStyle);
        }
        else if(nic.length() != 13){
            nicValidation.setText("! NIC must contain exactly 13 digits");
            nicField.setStyle(errorStyle);
        }
        else if (!nic.matches(numericRegex)) {
            nicValidation.setText("! NIC cannot contain letters");
            nicField.setStyle(errorStyle);
        }
        else if (fNameValidation.getText().isBlank() && lNameValidation.getText().equals("") && phoneNoValidation.getText().equals("") && emailValidation.getText().equals("") && passValidation.getText().equals("") && nicValidation.getText().equals("") && genderValidation.getText().equals("")){
            new General_Functions().switchScene(e,"SignUpDone_Prompt.fxml");
        }
    }
    public void clear(){
        firstnameField.setStyle(resetStyle);
        lastnameField.setStyle(resetStyle);
        passwordField.setStyle(resetStyle);
        emailField.setStyle(resetStyle);
        phoneNoField.setStyle(resetStyle);
        nicField.setStyle(resetStyle);


        fNameValidation.setText("");
        lNameValidation.setText("");
        emailValidation.setText("");
        passValidation.setText("");
        phoneNoValidation.setText("");
        nicValidation.setText("");
        genderValidation.setText("");
    }
    public void close(){
        new General_Functions().close(close);
    }
    public void goBack() throws IOException {
        //TODO add fxml file here which will be switched when user go back from signup
        new General_Functions().switchScene("");
    }



}
