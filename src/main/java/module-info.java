module com.example.javafxproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxproj to javafx.fxml;
    exports com.example.javafxproj;
}