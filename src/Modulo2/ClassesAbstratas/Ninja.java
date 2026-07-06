package Modulo2.ClassesAbstratas;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " +nome+" e essa é minha estratégia de combate.");
    }
}
