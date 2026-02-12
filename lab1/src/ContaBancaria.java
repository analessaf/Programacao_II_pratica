public class ContaBancaria {
    String nomeCorrentista;
    double saldo;
    public ContaBancaria(String nome){
        nomeCorrentista = nome;
    }
    public ContaBancaria(String nome, double saldoInicial) throws SaldoInicialInavalidoExpection{
        nomeCorrentista = nome;
        if (saldoInicial > 500000000){
            throw new SaldoInicialInavalidoExpection("deposito maximo");
        }
        saldo = saldoInicial;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public boolean depositar(double valor) throws DepositoMaximoExcedidoException{
         if (valor >= 1000000000){
            throw new DepositoMaximoExcedidoException("Valor do deposito é maior que o permitido");
        }
        saldo += valor;
        return true;
    }
    public boolean sacar (double valor) throws SaqueInvalidoException{
        if (valor > valor){
            throw new SaqueInvalidoException("Valor do saque é maior que seu saldo");
        }
        saldo -= valor;
        return true;
    }
}