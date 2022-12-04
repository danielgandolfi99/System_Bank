package project.system_bank;

import java.util.Objects;

public abstract class Conta {
    private int conta_id;
    private int agencia;
    private double saldo;
    private String cpf;

    private String tipo;

    public Conta(int agencia, double saldo, String cpf, String tipo) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public Conta(int conta_id, int agencia, double saldo, String cpf, String tipo) {
        this.conta_id = conta_id;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public Conta() {
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}