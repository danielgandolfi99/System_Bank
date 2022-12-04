package project.system_bank;

import db.DAO_cliente;
import db.DAO_conta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;
import static project.system_bank.LogClass.escreve;

public class ClassCriarConta implements Initializable {

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
    private ComboBox<TipoConta> tipoConta;

    private List<TipoConta> conta = new ArrayList<>();

    private ObservableList<TipoConta> obsTipoConta;

    public void carregarTipoConta(){
        TipoConta conta1 = new TipoConta(1, "Corrente");
        TipoConta conta2 = new TipoConta(2, "Poupança");

        conta.add(conta1);
        conta.add(conta2);

        obsTipoConta = FXCollections.observableArrayList(conta);
        tipoConta.setItems(obsTipoConta);
    }
    @FXML
    void confirmar(ActionEvent event) throws IOException {
        try{
            Cliente cliente = new Cliente((nome.getText() + " " + sobrenome.getText()), cpf.getText(), telefone.getText(), email.getText(), data_nascimento.getValue().toString());
            DAO_cliente.add(cliente);

            if(String.valueOf(tipoConta.getValue()).equals("Corrente")){
                ContaCorrente conta = new ContaCorrente(0, cliente.getCpf_conta());
                DAO_conta.add(conta);
            }else{
                ContaPoupanca conta = new ContaPoupanca(0, cliente.getCpf_conta());
                DAO_conta.add(conta);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
            escreve(e.getMessage());
        }
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    public void campoNumericoCPF(){
        cpf.textProperty().addListener(
                (observable, oldValue, newValue) -> {
                    try {
                        if (!newValue.equals("")) {
                            String cpf_numerico = cpf.getText();
                            cpf_numerico = cpf_numerico.replaceAll("[^0-9]","");
                            cpf.setText(cpf_numerico);
                        }
                    } catch (Exception e) {
                        cpf.setText(oldValue);
                    }
                }
        );
    }

    public void campoNumericoTelefone(){
        telefone.textProperty().addListener(
                (observable, oldValue, newValue) -> {
                    try {
                        if (!newValue.equals("")) {
                            String numero = telefone.getText();
                            numero = numero.replaceAll("[^0-9]","");
                            telefone.setText(numero);
                        }
                    } catch (Exception e) {
                        telefone.setText(oldValue);
                    }
                }
        );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        campoNumericoCPF();
        campoNumericoTelefone();
        carregarTipoConta();
    }
}