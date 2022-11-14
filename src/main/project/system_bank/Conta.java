package project.system_bank;

import java.util.Objects;

public class Conta {
    private int conta_id;
    private int agencia;
    private int  saldo;
    private int tipo;
    private int usuario;
    private int senha;

    public Conta(int conta_id, int agencia, int saldo, int tipo, int usuario, int senha) {
        this.conta_id = conta_id;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipo = tipo;
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return conta_id == conta.conta_id && agencia == conta.agencia && saldo == conta.saldo && tipo == conta.tipo && usuario == conta.usuario && senha == conta.senha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(conta_id, agencia, saldo, tipo, usuario, senha);
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
