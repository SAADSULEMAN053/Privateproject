package com.example.ahhasc;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class General_Functions {
    CustomerSignUp_Controller obj = new CustomerSignUp_Controller();
    public void switchScene(String fxml) throws  IOException {
        Stage stage = new Stage() ;
        Scene scene;
        FXMLLoader fxmlLoader = new FXMLLoader(General_Functions.class.getResource(fxml));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    public  void switchScene(Event e, String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(General_Functions.class.getResource(fxml));
        obj.stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        obj.scene = new Scene(fxmlLoader.load());
        obj.stage.setScene(obj.scene);
        obj.stage.centerOnScreen();
        obj.stage.show();
    }
    public void close(Button b){
        obj.stage = (Stage) b.getScene().getWindow();
        obj.stage.close();
    }

}
