package project.system_bank;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int conta_id, int agencia, double saldo, String cpf) {
        super(conta_id, agencia, saldo, cpf, "p");
    }

    public ContaPoupanca() {
        super();
    }

    @Override
    public boolean saca(double valor) {
        if(super.getSaldo() < valor) {
            return false;
        }
        super.setSaldo(super.getSaldo()-valor);
        return true;
    }

    @Override
    public boolean deposita(double valor) {
        if(valor<0.0){
            return false;
        }
        super.setSaldo(super.getSaldo()+valor*1.01);
        return true;
    }
    @Override
    public boolean transfere(double valor, Conta conta){
        if(valor>200 || valor<0 || super.getSaldo()<valor*1.05){
            return false;
        }
        super.setSaldo(super.getSaldo()-valor);
        conta.setSaldo(conta.getSaldo()+valor);
        return true;
    }

    @Override
    public boolean pix(double valor, Conta conta){
        if(valor>(super.getSaldo()) || valor<0){
            return false;
        }
        super.setSaldo(super.getSaldo()-valor);
        conta.setSaldo(conta.getSaldo()+valor);
        return true;
    }

}
