package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static project.system_bank.LogClass.escreve;

public class ConexaoDB {
    public static Connection getConnection() {
        System.out.println("Tentando conexão...");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","plqazm1928");
            System.out.println("Conexão feita com sucesso!");
            return conn;
        } catch (SQLException e){
            escreve("ConexaoDB: " + e.getMessage());
            System.out.println("Conexão falhou!");
            e.printStackTrace();
        }
        return null;
    }
}
