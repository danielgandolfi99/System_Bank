package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class home_login {

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    void setLogin(ActionEvent event) {

    }


    @FXML
    void setPassword(ActionEvent event) throws IOException {
        login_action(event);
    }

    @FXML
    void login_action(ActionEvent event) throws IOException {

        Login_Home user = new Login_Home(login.getText(),password.getText());
        System.out.println(user);
        //BankApp.getStage().close();
    }

    @FXML
    void createAccount(ActionEvent event) throws IOException {
        BankApp.createAccount();
        BankApp.getStage().close();
    }
}
