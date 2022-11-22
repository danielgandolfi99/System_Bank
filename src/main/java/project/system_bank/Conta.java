package project.system_bank;

import java.util.Objects;

public abstract class Conta {
    private int conta_id;
    private int agencia;
    private double saldo;
    private String usuario;
    private String senha;


    public Conta(int conta_id, int agencia, double saldo, String usuario, String senha) {
        this.conta_id = conta_id;
        this.agencia = agencia;
        this.saldo = saldo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public abstract boolean pix(double valor, Conta conta);
    public abstract boolean saca(double valor);

    public abstract boolean transfere(double valor, Conta conta);
    public abstract boolean deposita(double valor);

    public int getConta_id() {
        return conta_id;
    }

    public void setConta_id(int conta_id) {
        this.conta_id = conta_id;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}