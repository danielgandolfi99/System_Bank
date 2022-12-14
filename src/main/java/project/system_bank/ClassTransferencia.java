package project.system_bank;

import db.ConexaoDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static project.system_bank.LogClass.escreve;
import static project.system_bank.Pdf.gerarPdf;

public class ClassTransferencia { // Daniel

    @FXML
    private TextField valor;

    @FXML
    private TextField CPF_sai;

    @FXML
    private TextField CPF_recebe;

    @FXML
    void voltar(ActionEvent event) throws IOException {
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

    @FXML
    void confirmar(ActionEvent event) throws IOException {
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT saldo, tipo FROM conta WHERE cpf = ?;");
            stmt.setString(1,CPF_sai.getText());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            float saldos = rs.getFloat("saldo");
            float quantidade = (Float.valueOf(valor.getText()));
            String tipo = rs.getString("tipo");

            if(saldos>=(quantidade*(float) 1.05) && tipo.equals("Corrente")){
                stmt = conn.prepareStatement("UPDATE conta SET saldo = saldo - ? WHERE cpf = ?;");
                stmt.setFloat(1,(quantidade * (float) 1.05));
                stmt.setString(2,CPF_sai.getText());
                stmt.execute();

                stmt = conn.prepareStatement("UPDATE conta SET saldo = saldo + ? WHERE cpf = ?;");
                stmt.setFloat(1,quantidade);
                stmt.setString(2,CPF_recebe.getText());
                stmt.execute();

                rs.close();
                stmt.close();
                conn.close();
            } else if(saldos>=(quantidade*(float) 1.05) && (quantidade*(float) 1.05)<=200){
                stmt = conn.prepareStatement("UPDATE conta SET saldo = saldo - ? WHERE cpf = ?;");
                stmt.setFloat(1,(quantidade * (float) 1.05));
                stmt.setString(2,CPF_sai.getText());
                stmt.execute();

                stmt = conn.prepareStatement("UPDATE conta SET saldo = saldo + ? WHERE cpf = ?;");
                stmt.setFloat(1,quantidade);
                stmt.setString(2,CPF_recebe.getText());
                stmt.execute();

                rs.close();
                stmt.close();
                conn.close();
            }else{
                System.out.println("CLASSTRANSFERENCIA: Tentativa inv??lida!");
            }
        }
        catch (Exception e){
            escreve("ClassTransferencia: " + String.valueOf(e));
        }
        gerarPdf();
        BankApp.getStage().close();
        BankApp.trocaTela("dados_conta");
    }

}
