module com.example.lab12 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires poi;
    requires java.sql;
    requires org.junit.jupiter.api;
    requires junit;


    opens com.example.lab12 to javafx.fxml;
    exports com.example.lab12;
}