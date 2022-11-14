package db.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public static Connection getConnection() {
        System.out.println("Tentando conexão...");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","plqazm1928");
            System.out.println("Conexão feita com sucesso!");
            return conn;
        } catch (SQLException e){
            //SALVAR A EXCEPTION NUM ARQUIVO
            //e.getMessage(); <- Funcao que recebe o erro como string
            System.out.println("Conexão falhou!");
            e.printStackTrace();
        }
        return null;
    }


}
