package project.system_bank;

import db.ConexaoDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CriarConta {

    @FXML
    private TextField nome;

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
