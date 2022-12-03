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

        FXMLLoader criar_conta_FXML = new FXMLLoader(BankApp.class.getResource("criar_conta.fxml"));
        criar_conta = new Scene(criar_conta_FXML.load());

        FXMLLoader dados_conta_FXML = new FXMLLoader(BankApp.class.getResource("dados_conta.fxml"));
        dados_conta = new Scene(dados_conta_FXML.load());

        FXMLLoader deposito_FXML = new FXMLLoader(BankApp.class.getResource("deposito.fxml"));
        deposito = new Scene(deposito_FXML.load());

        FXMLLoader transferencia_FXML = new FXMLLoader(BankApp.class.getResource("transferencia.fxml"));
        transferencia = new Scene(transferencia_FXML.load());

        FXMLLoader pix_FXML = new FXMLLoader(BankApp.class.getResource("pix.fxml"));
        pix = new Scene(pix_FXML.load());

        FXMLLoader alterar_dados_FXML = new FXMLLoader(BankApp.class.getResource("alterar_dados.fxml"));
        alterar_dados = new Scene(alterar_dados_FXML.load());

        FXMLLoader excluir_conta_FXML = new FXMLLoader(BankApp.class.getResource("excluir_conta.fxml"));
        excluir_conta = new Scene(excluir_conta_FXML.load());

        primaryStage.setScene(dados_conta);
        primaryStage.show();
    }

    public static void trocaTela(String tela) throws IOException {
        switch (tela){
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
        launch();
    }

}