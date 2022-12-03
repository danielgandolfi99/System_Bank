package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClassCriarConta {

    @FXML
    private TextField telefone;

    @FXML
    private DatePicker data_nascimento;

    @FXML
    private TextField cpf;

    @FXML
    private TextField nome;

    @FXML
    private TextField sobrenome;

    @FXML
    private TextField email;

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}