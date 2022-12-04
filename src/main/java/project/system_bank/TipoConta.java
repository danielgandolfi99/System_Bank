package project.system_bank;

public class TipoConta { // Lucas
    private int id;
    private String tipo_da_conta;

    public TipoConta(int id, String tipo_da_conta) {
        this.id = id;
        this.tipo_da_conta = tipo_da_conta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_da_conta() {
        return tipo_da_conta;
    }

    public void setTipo_da_conta(String tipo_da_conta) {
        this.tipo_da_conta = tipo_da_conta;
    }

    @Override
    public String toString() {
        return getTipo_da_conta();
    }
}
