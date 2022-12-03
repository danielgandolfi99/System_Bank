package project.system_bank;

import db.DAO_cliente;
import db.DAO_conta;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BankApp extends Application {

    private static Stage stage;

    private static Scene start;
    private static Scene criar_conta;
    private static Scene criar_login;
    private static Scene dados_conta;
    private static Scene deposito;
    private static Scene extrato;
    private static Scene transferencia;
    private static Scene pix;
    private static Scene pix_chave;
    private static Scene pix_cpf;
    private static Scene pix_email;
    private static Scene pix_telefone;
    private static Scene alterar_dados;
    private static Scene excluir_conta;


    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        primaryStage.setTitle("System Bank");

        FXMLLoader start_FXML = new FXMLLoader(BankApp.class.getResource("start_bank.fxml"));
        start = new Scene(start_FXML.load());

        FXMLLoader criar_conta_FXML = new FXMLLoader(BankApp.class.getResource("criar_conta.fxml"));
        criar_conta = new Scene(criar_conta_FXML.load());

        FXMLLoader criar_login_FXML = new FXMLLoader(BankApp.class.getResource("criar_login.fxml"));
        criar_login = new Scene(criar_login_FXML.load());

        FXMLLoader dados_conta_FXML = new FXMLLoader(BankApp.class.getResource("dados_conta.fxml"));
        dados_conta = new Scene(dados_conta_FXML.load());

        FXMLLoader deposito_FXML = new FXMLLoader(BankApp.class.getResource("deposito.fxml"));
        deposito = new Scene(deposito_FXML.load());

        FXMLLoader extrato_FXML = new FXMLLoader(BankApp.class.getResource("extrato.fxml"));
        extrato = new Scene(extrato_FXML.load());

        FXMLLoader transferencia_FXML = new FXMLLoader(BankApp.class.getResource("transferencia.fxml"));
        transferencia = new Scene(transferencia_FXML.load());

        FXMLLoader pix_FXML = new FXMLLoader(BankApp.class.getResource("pix.fxml"));
        pix = new Scene(pix_FXML.load());

        FXMLLoader pix_chave_FXML = new FXMLLoader(BankApp.class.getResource("pix_chave.fxml"));
        pix_chave = new Scene(pix_chave_FXML.load());

        FXMLLoader pix_cpf_FXML = new FXMLLoader(BankApp.class.getResource("pix_cpf.fxml"));
        pix_cpf = new Scene(pix_cpf_FXML.load());

        FXMLLoader pix_email_FXML = new FXMLLoader(BankApp.class.getResource("pix_email.fxml"));
        pix_email = new Scene(pix_email_FXML.load());

        FXMLLoader pix_telefone_FXML = new FXMLLoader(BankApp.class.getResource("pix_telefone.fxml"));
        pix_telefone = new Scene(pix_telefone_FXML.load());

        FXMLLoader alterar_dados_FXML = new FXMLLoader(BankApp.class.getResource("alterar_dados.fxml"));
        alterar_dados = new Scene(alterar_dados_FXML.load());

        FXMLLoader excluir_conta_FXML = new FXMLLoader(BankApp.class.getResource("excluir_conta.fxml"));
        excluir_conta = new Scene(excluir_conta_FXML.load());

        primaryStage.setScene(start);
        primaryStage.show();
    }

    public static void trocaTela(String tela) throws IOException {
        switch (tela){
            case "start":
                stage.setScene(start);
                stage.show();
                break;
            case "criar_conta":
                stage.setScene(criar_conta);
                stage.show();
                break;
            case "criar_login":
                stage.setScene(criar_login);
                stage.show();
                break;
            case "dados_conta":
                stage.setScene(dados_conta);
                stage.show();
                break;
            case "deposito":
                stage.setScene(deposito);
                stage.show();
                break;
            case "extrato":
                stage.setScene(extrato);
                stage.show();
                break;
            case "transferencia":
                stage.setScene(transferencia);
                stage.show();
                break;
            case "pix":
                stage.setScene(pix);
                stage.show();
                break;
            case "pix_chave":
                stage.setScene(pix_chave);
                stage.show();
                break;
            case "pix_cpf":
                stage.setScene(pix_cpf);
                stage.show();
                break;
            case "pix_email":
                stage.setScene(pix_email);
                stage.show();
                break;
            case "pix_telefone":
                stage.setScene(pix_telefone);
                stage.show();
                break;
            case "alterar_dados":
                stage.setScene(alterar_dados);
                stage.show();
                break;
            case "excluir_conta":
                stage.setScene(excluir_conta);
                stage.show();
                break;
            default:
                break;
        }
    }


    public static Stage getStage(){
        return stage;
    }


    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose", "122131212", "bobao", "sa@12", "12/12/12");
        Conta contac = new ContaPoupanca(2, 122112.123, "122131212");
        DAO_cliente.update(cliente);
        DAO_conta.remove(contac);
    }

}