package Modulo2.ClassesAbstratas;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 1.80; //final é o equivalente a const em JS, métodos ou atributos tem valores constantes e imutáveis

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //Sobrecarga de construtor
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " +nome+" e essa é minha ESTRATÉGIA de combate.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " +nome+" e essa é minha INTELIGÊNCIA de combate.");
    }

    //Sobrecarga de método (adicionando parametro)

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " +qi+" e você é um gênio.");
        } else if(qi >= 130 ) {
            System.out.println("Seu QI é " +qi+" e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é " +qi+" e você precisa treinar mais suas estratégias.");
        }
    }

    //Sobrescrevendo o toString para retornar uma resposta
    @Override
    public String toString() {
        return "Esse é o retorno do valor em memória";
    }

    final void tacarKunai() {
        System.out.println("Você jogou uma kunai");
    }
}
