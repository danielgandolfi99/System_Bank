package project.system_bank;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo, String cpf) {
        super(110, saldo, cpf, "Poupança");
    }

    public ContaPoupanca() {
        super();
    }

}
