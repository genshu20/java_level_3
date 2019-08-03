package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegController {
    @FXML
    public TextField loginFild;
    @FXML
    public TextField passFild;
    @FXML
    public TextField nickFild;
    @FXML
    public Button buttonClose;
    @FXML
    public Button buttonReg;
    @FXML
    public Button buttonEdit;
    Controller controller;

    public void clickClose(ActionEvent actionEvent) {
        Stage stage=(Stage) buttonClose.getScene().getWindow();
        stage.close();
    }

    public void clickReg(ActionEvent actionEvent) {
        try {
            controller.out.writeUTF("/reg "+loginFild.getText()+" "+passFild.getText()+" "+nickFild.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickEdit(ActionEvent actionEvent) {
        if(controller.isAuthorized){
            try {
                controller.out.writeUTF("/edit "+loginFild.getText()+" "+passFild.getText()+" "+nickFild.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
