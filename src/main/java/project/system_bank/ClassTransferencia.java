package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClassTransferencia {

    @FXML
    private TextField valor;

    @FXML
    private TextField CPF_sai;

    @FXML
    private TextField CPF_recebe;

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}
