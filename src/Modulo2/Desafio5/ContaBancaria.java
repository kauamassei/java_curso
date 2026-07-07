package Modulo2.Desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void transferenciasEntreContas(ContaBancaria contaDestino, double valorTransferencia) {
        if (this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia;
            contaDestino.saldo += valorTransferencia;
            System.out.println("Tranferência de " + valorTransferencia + "R$ realizada com sucesso para " + contaDestino);
            this.consultarSaldo();

        } else {
            System.out.println("Saldo insuficiente para completar a trasnferência!");
        }
    }

    @Override
    public String toString() {
        return "Esta é uma conta bancária do Banco";
    }
}
