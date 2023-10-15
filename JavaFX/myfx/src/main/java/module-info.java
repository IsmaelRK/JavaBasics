module com.mycompany.myfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.myfx to javafx.fxml;
    exports com.mycompany.myfx;
}
