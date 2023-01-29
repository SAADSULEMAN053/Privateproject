module com.example.ahhasc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ahhasc to javafx.fxml;
    exports com.example.ahhasc;
}