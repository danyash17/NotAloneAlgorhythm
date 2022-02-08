module com.example.notalone {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;


    opens com.example.notalone to javafx.fxml;
    exports com.example.notalone;
}