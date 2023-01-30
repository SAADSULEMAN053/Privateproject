module com.example.ahhasc {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    opens com.example.ahhasc to javafx.fxml;
    exports com.example.ahhasc;
opens ModelClasses to javafx.fxml;
    exports ModelClasses;
}