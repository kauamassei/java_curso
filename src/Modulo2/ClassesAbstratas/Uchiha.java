package Modulo2.ClassesAbstratas;

public class Uchiha extends Ninja implements SharinganInterface, AnbuInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " +nome+" e essa é minha estratégia Uchiha de combate. Já completei: " +numeroDeMissoesConcluidas+ " missões e meu nível é: " +rank);
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou " +nome+ ", ninja de elite da Anbu.");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sou " +nome+ " e meu sharingan foi ativado");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " +qi+" e você é um gênio.");
        } else if(qi >= 130 ) {
            System.out.println("Seu QI é " +qi+" e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é " +qi+" e você precisa treinar mais suas estratégias.");
        }
    }
}
