package com.example.ahhasc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CustomerSignUpPromptController {

    @FXML
    void LogInForm(ActionEvent event) throws IOException {
        new General_Functions().switchScene(event, "Customer_SignUpPrompt.fxml");
    }

}
