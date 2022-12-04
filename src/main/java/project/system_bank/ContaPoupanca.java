package project.system_bank;

public class ContaPoupanca extends Conta{ // Daniel

    public ContaPoupanca(double saldo, String cpf) {
        super(110, saldo, cpf, "Poupança");
    }

    public ContaPoupanca() {
        super();
    }

}
