package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClassAlterarDados {

    @FXML
    private TextField telefone;

    @FXML
    private TextField cpf;

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
