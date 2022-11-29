package db;

import project.system_bank.Cliente;
import project.system_bank.ContaCorrente;
import project.system_bank.ContaPoupanca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static project.system_bank.LogClass.escreve;


public class DAO_conta implements DAO{
    //CONTINUAR MUDANDO A LIGAÇÃO ENTRE CLIENTE E CONTA -- COLOCAR O ID DO CLIENTE NA CONTA AO INVÉS DE COLOCAR NO CLIENTE
    // -- SEARCH POR CPF E LIGA OS IDS
    @Override
    public boolean add(Object obj) {
        Conta conta = (Conta) obj;//if
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertConta);
            stmt.setInt(1, conta.getAgencia());
            stmt.setDouble(2, conta.getSaldo());
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

    @Override
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

    @Override
    public Object search(Object obj) {
        return null;
    }

    @Override
    public List<Object> searchAll(Object obj) {
        List<Object> contas = new ArrayList();
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.searchCliente);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if(rs.getString("tipo").equals("c")){
                    ContaCorrente conta = new ContaCorrente();
                    conta.setConta_id(rs.getInt("conta_id"));
                    conta.setCpf(rs.getString("cpf"));
                    conta.setSaldo(rs.getFloat("saldo"));
                    conta.setAgencia(rs.getInt("agencia"));
                    conta.setTipo(rs.getString("tipo"));
                    contas.add(conta);
                } else {
                    ContaPoupanca conta = new ContaPoupanca();
                    conta.setConta_id(rs.getInt("conta_id"));
                    conta.setCpf(rs.getString("cpf"));
                    conta.setSaldo(rs.getFloat("saldo"));
                    conta.setAgencia(rs.getInt("agencia"));
                    conta.setTipo(rs.getString("tipo"));
                    contas.add(conta);
                }
            }
        } catch (SQLException e) {
            escreve(e.getMessage());
            System.out.println("SEARCH ALL DEU ERRADO!");
        }
        return contas;
    }
}
