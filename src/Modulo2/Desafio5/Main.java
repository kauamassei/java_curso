package Modulo2.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente(10, TipoConta.CORRENTE);
        contaCorrente1.depositar(25.90);
        contaCorrente1.consultarSaldo();

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(10, TipoConta.POUPANCA);
        contaPoupanca1.depositar(25.90);
        contaPoupanca1.consultarSaldo();

        contaCorrente1.transferenciasEntreContas(contaPoupanca1, 10);



    }
}
