package project.system_bank;

import db.DAO_cliente;
import db.DAO_conta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

import static project.system_bank.Pdf.gerarPdf;

public class ClassExcluirConta {

    @FXML
    private TextField CPF;

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        DAO_cliente.remove(CPF.getText());
        gerarPdf();
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}