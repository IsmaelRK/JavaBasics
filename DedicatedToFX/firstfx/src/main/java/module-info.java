module com.myfx.firstfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myfx.firstfx to javafx.fxml;
    exports com.myfx.firstfx;
}