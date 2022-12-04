package project.system_bank;

import db.ConexaoDB;
import db.DAO_cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static project.system_bank.LogClass.escreve;
import static project.system_bank.Pdf.gerarPdf;

public class ClassAlterarDados { // Daniel

    @FXML
    private TextField telefone;

    @FXML
    private TextField cpf;

    @FXML
    private TextField email;

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT cpf FROM cliente WHERE cpf = ?;");
            stmt.setString(1,cpf.getText());
            ResultSet rs = stmt.executeQuery();
            rs.next();

            Cliente cliente = new Cliente(null, cpf.getText(), telefone.getText(), email.getText(), null);
            DAO_cliente.update(cliente);

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            escreve("ClassAlterraDados:" + e.getMessage());
            System.out.println(e.getMessage());
        }
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
