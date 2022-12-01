package db;

import project.system_bank.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static project.system_bank.LogClass.escreve;


public class DAO_cliente {
    //CONTINUAR MUDANDO A LIGAÇÃO ENTRE CLIENTE E CONTA -- COLOCAR O ID DO CLIENTE NA CONTA AO INVÉS DE COLOCAR NO CLIENTE
    // -- SEARCH POR CPF E LIGA OS IDS
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
            System.out.println("ERRO DAO_CLIENTE/ADD");
            return false;
        }
        return true;
    }

    public boolean update(Object obj) {
        Cliente cliente = (Cliente) obj;
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.updateCliente);
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
            escreve(e.getMessage());
            System.out.println("ERRO DAO_CLIENTE/UPDATE!");
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        Cliente cliente = (Cliente) obj;
        try {
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.removeCliente);
            stmt.setInt(1, cliente.getCliente_id());
        }catch (SQLException e){
            escreve(e.getMessage());
            System.out.println("ERRO DAO_CLIENTE/REMOVE!");
            return false;
        }
        return true;
    }

    public Object search(Object obj) {
        return null;
    }

    public List<Object> searchAll(Object obj) {
        List<Object> clientes = new ArrayList();
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.searchCliente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCliente_id(rs.getInt("cliente_id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setNascimento(String.valueOf(rs.getDate("nascimento")));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            escreve(e.getMessage());
            System.out.println("SEARCH ALL DEU ERRADO!");
        }
        return clientes;
    }
}
