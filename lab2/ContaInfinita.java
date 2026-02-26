public class ContaInfinita extends Conta{
    public ContaInfinita(int numero, double saldo){
        super(numero,saldo);
    }

    public void depositar(double valor){
        saldo += valor + 5;
    }
    public boolean sacar(double valor){
        saldo -= valor;
        return true;
    }
}