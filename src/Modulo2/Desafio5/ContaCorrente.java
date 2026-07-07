package Modulo2.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual na conta corrente é de: R$" +saldo);
    }


}
