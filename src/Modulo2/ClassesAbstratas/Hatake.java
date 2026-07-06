package Modulo2.ClassesAbstratas;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void Greeting() {
        System.out.println("Meu nome é: " +nome+ " e eu sou do clã Hatake.");
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
