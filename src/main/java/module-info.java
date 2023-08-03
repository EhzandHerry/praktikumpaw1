module com.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.helloworld to javafx.fxml;
    exports com.helloworld;
}
