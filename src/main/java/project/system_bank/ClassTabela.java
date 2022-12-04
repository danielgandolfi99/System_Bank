package project.system_bank;

import db.DAO_cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClassTabela {


    @FXML
    private TableView<Cliente> tabela_cliente;

    @FXML
    private TableView<Conta> tabela_conta;

    @FXML
    private TableColumn<Cliente, String> telefone;

    @FXML
    private TableColumn<Cliente, String> nascimento;

    @FXML
    private TableColumn<Conta, String> tipo;

    @FXML
    private TableColumn<Conta, Integer> conta_id;

    @FXML
    private TableColumn<Conta, String> cpf;

    @FXML
    private TableColumn<Conta, String> cpf_cliente;

    @FXML
    private TableColumn<Cliente, String> nome;

    @FXML
    private TableColumn<Conta, Float> saldo;

    @FXML
    private TableColumn<Cliente, Integer> cliente_id;

    @FXML
    private TableColumn<Cliente, String> email;

    @FXML
    private TableColumn<Conta, Integer> agencia;

    @FXML
    void voltar(ActionEvent event) {

    }

    @FXML
    void pesquisar(ActionEvent event) {
        telefone.setCellValueFactory(new PropertyValueFactory("telefone"));
        nascimento.setCellValueFactory(new PropertyValueFactory("nascimento"));
        tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
        conta_id.setCellValueFactory(new PropertyValueFactory("conta_id"));
        cpf.setCellValueFactory(new PropertyValueFactory("cpf"));
        cpf_cliente.setCellValueFactory(new PropertyValueFactory("cpf_cliente"));
        nome.setCellValueFactory(new PropertyValueFactory("nome"));
        saldo.setCellValueFactory(new PropertyValueFactory("saldo"));
        cliente_id.setCellValueFactory(new PropertyValueFactory("cliente_id"));
        email.setCellValueFactory(new PropertyValueFactory("email"));
        agencia.setCellValueFactory(new PropertyValueFactory("agencia"));

        tabela_cliente.setItems(obsCliente());

    }


    public ObservableList<Cliente> obsCliente (){
        return FXCollections.observableArrayList(DAO_cliente.searchAll());
    }

}