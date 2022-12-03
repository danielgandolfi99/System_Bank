package project.system_bank;

public class ClassContaAgencia {

    private int agencia;

    private int conta;

    public ClassContaAgencia(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassContaAgencia that = (ClassContaAgencia) o;

        if (agencia != that.agencia) return false;
        return conta == that.conta;
    }

    @Override
    public String toString() {
        return "ClassContaAgencia{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                '}';
    }
}