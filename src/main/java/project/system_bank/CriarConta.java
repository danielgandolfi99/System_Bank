package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CriarConta {

    @FXML
    private TextField nome;

    @FXML
    private TextField sobrenome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField telefone;

    @FXML
    private TextField email;

    @FXML
    private DatePicker data_nascimento;

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("criar_login");
    }

    @FXML
    void fazerLogin(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("start");
    }
}