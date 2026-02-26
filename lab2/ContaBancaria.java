public class ContaBancaria extends Conta{
    public ContaBancaria(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void depositar (double valor){
        saldo += valor;
    }

    @Override
    public boolean sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
}