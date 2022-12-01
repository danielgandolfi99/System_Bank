package db;

import project.system_bank.Cliente;
import project.system_bank.Conta;
import project.system_bank.ContaCorrente;
import project.system_bank.ContaPoupanca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static project.system_bank.LogClass.escreve;


public class DAO_conta{
    public boolean add(Object obj, String tipo) {
        if (tipo.equals('c')) {
            ContaCorrente conta = (ContaCorrente) obj;
            try {
                Connection conn = ConexaoDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertConta);
                stmt.setString(1, "c");
                stmt.setString(2, conta.getCpf());
                stmt.execute();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                escreve(e.getMessage());
                System.out.println("ERRO ADD/DAO_CONTA");
                return false;
            }
        } else {
            ContaPoupanca conta = (ContaPoupanca) obj;
            try {
                Connection conn = ConexaoDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertConta);
                stmt.setString(1, "p");
                stmt.setString(2, conta.getCpf());
                stmt.execute();
                stmt.close();
                conn.close();
                return true;
            } catch (SQLException e) {
                escreve(e.getMessage());
                System.out.println("ERRO ADD/DAO_CONTA");
                return false;
            }
        }
        return true;
    }


    public boolean update(Object obj) {

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
