module com.example.notalone {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.notalone to javafx.fxml;
    opens com.example.notalone.app.controller to javafx.fxml;

    exports com.example.notalone;
    exports com.example.notalone.app.logic;
    exports com.example.notalone.algo;
    opens com.example.notalone.algo to javafx.fxml;
    exports com.example.notalone.algo.entity;
}