package project.system_bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(int conta_id, double saldo, String cpf) {
        super(conta_id, 110, saldo, cpf, "c");
    }

    public ContaCorrente() {
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
        super.setSaldo(super.getSaldo()+valor);
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

    @Override
    public boolean transfere(double valor, Conta conta){
        if(valor>(super.getSaldo()*1.05) || valor<0){
            return false;
        }
        super.setSaldo(super.getSaldo()-valor);
        conta.setSaldo(conta.getSaldo()+valor);
        return true;
    }

}
