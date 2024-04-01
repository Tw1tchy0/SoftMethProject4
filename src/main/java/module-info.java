module com.example.testproject4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.testproject4 to javafx.fxml;
    exports com.example.testproject4;
}