package Modulo2.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Iruka = new NinjaBasico("Iruka", 28, "Clone das sombras");
        Iruka.mostrarInformacoes();
        Iruka.executarHabilidade();

        NinjaAvancado Orochimaru = new NinjaAvancado("Orochimaru", 30, "Regeneração", "Edo Tensei");
        Orochimaru.mostrarInformacoes();
        Orochimaru.executarHabilidade();

    }
}
