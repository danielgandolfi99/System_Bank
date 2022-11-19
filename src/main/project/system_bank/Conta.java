package project.system_bank;

import java.util.Objects;

public abstract class Conta {
    private int conta_id;
    private int agencia;
    private int saldo;
    private int tipo;
    private int usuario;
    private int senha;


    public abstract int getConta_id();

    public abstract void setConta_id(int conta_id);

    public abstract int getAgencia();

    public abstract void setAgencia(int agencia);

    public abstract int getSaldo();

    public abstract void setSaldo(int saldo);

    public abstract int getTipo();

    public abstract void setTipo(int tipo);

    public abstract int getUsuario();

    public abstract void setUsuario(int usuario);

    public abstract int getSenha();

    public abstract void setSenha(int senha);
}