package project.system_bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, String cpf) {
        super(110, saldo, cpf, "Corrente");
    }

    public ContaCorrente() {
        super();
    }
}
