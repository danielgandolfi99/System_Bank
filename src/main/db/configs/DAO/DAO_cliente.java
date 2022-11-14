package db.configs.DAO;

import db.configs.ConexaoDB;
import db.configs.Sql_constants;
import project.system_bank.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAO_cliente implements DAO{

    @Override
    public boolean add(Object obj) {
        Cliente cliente = (Cliente) obj;
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertCliente);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getCpf());
            stmt.setString(3,cliente.getTelefone());
            stmt.setString(4,cliente.getEmail());
            stmt.setString(5,cliente.getNascimento());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch(SQLException e){
            //COLOCAR ERRO NA LOG
            System.out.println("Algum erro aconteceu!");
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Object obj) {
        Cliente cliente = (Cliente) obj;
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.updateCliente);
            stmt.setInt(1, cliente.getCliente_id());
            stmt.setString(2,cliente.getNome());
            stmt.setString(3,cliente.getCpf());
            stmt.setString(4,cliente.getTelefone());
            stmt.setString(5,cliente.getEmail());
            stmt.setString(6,cliente.getNascimento());
            stmt.setInt(7, cliente.getCliente_id());
            stmt.execute();
            stmt.close();
            conn.close();
            System.out.println("Atualização feita com sucesso!");
        } catch(SQLException e){
            //COLOCAR ERRO NA LOG
            System.out.println("Algum erro aconteceu!");
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(Object obj) {
        Cliente cliente = (Cliente) obj;
        try {
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.removeCliente);
            stmt.setInt(1, cliente.getCliente_id());
        }catch (SQLException e){
            //COLOCAR NA LOG
            System.out.println("Algum erro aconteceu!");
            return false;
        }
        return true;
    }

    @Override
    public Object search(Object obj) {
        return null;
    }

    @Override
    public List<Object> searchAll(Object obj) {
        return null;
    }
}
