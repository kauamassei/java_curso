package Modulo2.Desafio5;

public interface Conta {

    void consultarSaldo();
    void depositar(double valor);
    void transferenciasEntreContas(ContaBancaria contaDestino, double valorTransferencia);

}
