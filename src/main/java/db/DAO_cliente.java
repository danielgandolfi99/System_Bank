package db;

import project.system_bank.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class DAO_cliente implements DAO{

    @Override
    public boolean add(Object obj) {
        Cliente cliente = (Cliente) obj;
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertCliente);
            stmt.setString(1,cliente.getNome());
            stmt.setString(2,cliente.getSobrenome());
            stmt.setString(3,cliente.getCpf());
            stmt.setString(4,cliente.getTelefone());
            stmt.setString(5,cliente.getEmail());
            stmt.setString(6,cliente.getNascimento());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch(SQLException e){
            //COLOCAR ERRO NA LOG
            System.out.println("ERRO DAO_CLIENTE/ADD");
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
            stmt.setString(3,cliente.getSobrenome());
            stmt.setString(4,cliente.getCpf());
            stmt.setString(5,cliente.getTelefone());
            stmt.setString(6,cliente.getEmail());
            stmt.setString(7,cliente.getNascimento());
            stmt.setInt(8, cliente.getCliente_id());
            stmt.execute();
            stmt.close();
            conn.close();
            System.out.println("Atualização feita com sucesso!");
        } catch(SQLException e){
            //COLOCAR ERRO NA LOG
            System.out.println("ERRO DAO_CLIENTE/UPDATE!");
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
            System.out.println("ERRO DAO_CLIENTE/REMOVE!");
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
        List<Object> clientes = new ArrayList();
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.searchCliente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                /*Cliente cliente = new Cliente();
                cliente.setCliente_id(rs.getInt("cliente_id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setNascimento(String.valueOf(rs.getDate("nascimento")));
                clientes.add(cliente);*/
            }
        } catch (SQLException e) {
            System.out.println("SEARCH ALL DEU ERRADO!");
        }
        return clientes;
    }
}
