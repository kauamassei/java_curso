package Modulo2.ClassesAbstratas;

public class Uchiha extends Ninja implements SharinganInterface, AnbuInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " +nome+" e essa é minha estratégia Uchiha de combate.");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou " +nome+ ", ninja de elite da Anbu.");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sou " +nome+ " e meu sharingan foi ativado");
    }
}
