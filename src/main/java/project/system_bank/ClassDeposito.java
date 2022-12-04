package project.system_bank;


import db.ConexaoDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static project.system_bank.LogClass.escreve;

public class ClassDeposito {

    @FXML
    private TextField valor;

    @FXML
    private TextField CPF;

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE conta SET saldo = saldo + ? WHERE cpf = ?;");
            stmt.setFloat(1, Float.valueOf(valor.getText()));
            stmt.setString(2, CPF.getText());
            stmt.execute();

            stmt.close();
            conn.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
            escreve(e.getMessage());
        }
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}
