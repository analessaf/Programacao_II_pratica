public class CaixaEletronicoApp{
    static ContaBancaria conta;
    public static void main(String[] args) {
        String nome = ES.input("Nome do correntista: ");
        double saldoIni = ES.toDouble(ES.input("Saldo inicial: "));
        conta = new ContaBancaria(nome, saldoIni);
        boolean sair = false;
        while (!sair){
            String opcao = dialogoPrincipal();
            if (opcao.equals("1")) { ES.print("Saldo: " + conta.getSaldo());}
            else if (opcao.equals("2")){ ES.print("Correntista: " + conta.getNomeCorrentista());}
            else if (opcao.equals("3")){dialogoDepositar();}
            else if (opcao.equals("4")){dialogoSacar();}
            else if (opcao.equals("0")){
                sair = true;
                ES.print("Voce escolheu sair!");
            } else {
                ES.print("Opcao invalida!");
            }
        }
        ES.print("fim");
    }
    static String dialogoPrincipal(){
        String msg = "\nMENU PRINCIPAL: " + "\n(1) Mostrar saldo" + "\n(2) Mostrar correntista";
        msg += "\n (3) Depositar" + "\n (4) Sacar" + "\n(0) Sair" + "\nOPCAO DESEJADA: ";
        return ES.input(msg);
    }
    static void dialogoDepositar(){
        double valor = ES.toDouble(ES.input("valor do deposito: "));
        try {
            conta.depositar(valor);
            ES.print("Deposito efetuado!");
        } catch (Exception DepositoMaximoExcedidoException){
            ES.print("Deposito Maximo permitido");
        }
    }
    static void dialogoSacar(){
        double valorS = ES.toDouble(ES.input("valor do saque: "));
        try {
            conta.sacar(valorS);
            ES.print("Saque efetuado!");
        } catch(Exception SaqueInvalidoException){
            ES.print("Saldo Insuficiente");
        }
    }
}