package com.myfx.firstfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    int conf = 0;
    String str1 = "Boa Tarde";
    String str2 = "Boa Noite";


    @FXML
    private Label lblmsg;
    private Button btn;


    @FXML
    private void clickedBtn(ActionEvent event) {


        if (conf == 0) {
            lblmsg.setText(str1);
            conf = 1;
        }
        else if (conf == 1) {
            lblmsg.setText(str2);
            conf = 0;
        }





    }

}