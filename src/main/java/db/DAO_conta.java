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
    public static boolean add(Conta conta) {
            try {
                Connection conn = ConexaoDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(Sql_constants.insertConta);
                stmt.setString(1, conta.getTipo());
                stmt.setString(2, conta.getCpf());
                stmt.execute();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                escreve(e.getMessage());
                System.out.println("ERRO ADD/DAO_CONTA: " + e.getMessage());
                return false;
            }
        return true;
    }

    public static boolean update(Conta conta) {
        try {
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.updateConta);
            stmt.setString(1, conta.getTipo());
            stmt.setString(2, conta.getCpf());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            escreve(e.getMessage());
            System.out.println("ERRO ADD/DAO_CONTA: " + e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean remove(Conta conta) {
        try {
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.removeConta);
            stmt.setString(1, conta.getCpf());
        }catch (SQLException e){
            escreve(e.getMessage());
            System.out.println("ERRO DAO_CLIENTE/REMOVE:" + e.getMessage());
            return false;
        }
        return true;
    }

    public static Conta search(Conta conta) {
        return null;
    }

    public static List<Conta> searchAll() {
        List<Conta> contas = new ArrayList<Conta>();
        try{
            Connection conn = ConexaoDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Sql_constants.searchConta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if(rs.getString("tipo").equals("c")){
                    Conta conta = new ContaCorrente();
                    conta.setConta_id(rs.getInt("conta_id"));
                    conta.setCpf(rs.getString("cpf"));
                    conta.setSaldo(rs.getFloat("saldo"));
                    conta.setAgencia(rs.getInt("agencia"));
                    conta.setTipo(rs.getString("tipo"));
                    contas.add(conta);
                } else {
                    Conta conta = new ContaPoupanca();
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
            System.out.println("SEARCH ALL CONTA DEU ERRADO: " + e.getMessage());
        }
        return contas;
    }
}
