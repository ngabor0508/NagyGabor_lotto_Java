module com.example.nagygabor_lotto_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nagygabor_lotto_java to javafx.fxml;
    exports com.example.nagygabor_lotto_java;
}