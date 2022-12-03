package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CriarLogin {

    @FXML
    private TextField agencia;

    @FXML
    private TextField conta;

    @FXML
    private TextField login;

    @FXML
    private PasswordField senha;

    @FXML
    private PasswordField confirma_senha;

    @FXML
    void confirmaSenha(ActionEvent event) throws IOException {
        confirmar(event);
    }

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}