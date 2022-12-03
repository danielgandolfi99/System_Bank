package project.system_bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.io.IOException;

public class DadosConta {

        @FXML
        private Text ag_conta;

        @FXML
        private Text tp_conta;

        @FXML
        private Text saldo;

        @FXML
        private Text nome_completo;

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
        void extrato(ActionEvent event) throws IOException {
            BankApp.getStage().close();
            BankApp.trocaTela("extrato");
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
        void sairConta(ActionEvent event) throws IOException {
            BankApp.getStage().close();
            BankApp.trocaTela("start");
        }

}
