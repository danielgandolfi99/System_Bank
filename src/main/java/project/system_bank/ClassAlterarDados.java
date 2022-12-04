package project.system_bank;

import db.ConexaoDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClassAlterarDados {

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
            PreparedStatement stmt = conn.prepareStatement("SELECT cpf FROM conta WHERE cpf = ?;");
            stmt.setString(1,cpf.getText());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String cpfs = rs.getString("cpf");
            String CPF_cliente = String.valueOf(cpf.getText());

            if(CPF_cliente == cpfs){
                stmt = conn.prepareStatement("UPDATE cliente SET telefone = ?, email = ? WHERE cpf = ?;");
                stmt.setString(1,telefone.getText());
                stmt.setString(2,email.getText());
                stmt.setString(3,cpf.getText());
                stmt.execute();

                stmt.close();
                conn.close();
            } else {
                System.out.println("CPF inválido!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}
