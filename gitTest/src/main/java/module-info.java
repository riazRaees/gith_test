module com.riaz.gittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.riaz.gittest to javafx.fxml;
    exports com.riaz.gittest;
}