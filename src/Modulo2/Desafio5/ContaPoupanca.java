package Modulo2.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - (valor*0.01);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual na conta poupanca é de: R$" +saldo);
    }
}
