package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ClassDadosConta { // Lucas

    @FXML
    void alterarDados(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("alterar_dados");
    }

    @FXML
    void transferencia(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("transferencia");
    }

    @FXML
    void excluirConta(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("excluir_conta");
    }

    @FXML
    void areaPix(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("pix");
    }

    @FXML
    void deposito(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("deposito");
    }

    @FXML
    void criarConta(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("criar_conta");
    }

    @FXML
    void dadosCadastrais(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_cadastrais");
    }

}
