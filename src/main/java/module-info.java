module com.example.firstjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.firstjavafxapp to javafx.fxml;
    exports com.example.firstjavafxapp;
}