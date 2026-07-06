package Modulo2.ClassesAbstratas;

public class Senju extends Hokages{

    public void Apresentacao() {
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos!");
    }

    @Override
    public void SabedoriaHokage() {
        System.out.println("Você ganhou sabedoria.");
    }

    @Override
    public void PoderDeHokage() {
        System.out.println("Você ganhou poder de Hokage.");
    }
}
