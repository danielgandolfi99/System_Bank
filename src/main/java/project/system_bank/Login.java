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

public class Login {

    @FXML
    private TextField login;

    @FXML
    private PasswordField senha;


    @FXML
    void setSenha(ActionEvent event) throws IOException {
        fazerLogin(event);
    }

    @FXML
    void fazerLogin(ActionEvent event) throws IOException {
        ClassLogin user = new ClassLogin(login.getText(),senha.getText());
        System.out.println(user);
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void criarConta(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("criar_conta");

    }
}
