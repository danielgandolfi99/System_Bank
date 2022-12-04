package project.system_bank;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import db.ConexaoDB;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static project.system_bank.LogClass.escreve;

public class Pdf {

    public static void gerarPdf(){
        try{
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lucas\\IdeaProjects\\System_Bank\\Dados.pdf"));
            document.open();

            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cliente;");
            ResultSet rs = stmt.executeQuery();

            document.add(new Paragraph("CLIENTES"));
            while(rs.next()){
                Paragraph prg = new Paragraph(rs.getString("cliente_id")+
                        " / " + rs.getString("nome")+
                        " / " + rs.getString("cpf")+
                        " / " + rs.getString("telefone")+
                        " / " + rs.getString("email")+
                        " / " + rs.getString("nascimento"));
                document.add(prg);
                document.add(new Paragraph(" "));
            }

            stmt = conn.prepareStatement("SELECT * FROM conta;");
            rs = stmt.executeQuery();

            document.add(new Paragraph("CONTAS"));
            while(rs.next()){
                Paragraph prg = new Paragraph(rs.getString("conta_id")+
                        " / " + rs.getInt("agencia")+
                        " / " + rs.getFloat("saldo")+
                        " / " + rs.getString("tipo")+
                        " / " + rs.getString("cpf"));
                document.add(prg);
                document.add(new Paragraph(" "));
            }

            document.close();
        }catch (Exception e){
            escreve(e.getMessage());
        }
    }

}
