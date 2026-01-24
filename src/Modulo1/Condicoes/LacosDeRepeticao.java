package Modulo1.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Lacos de repeticao: vao repetir infinitamente ou até que atinja o limite
        * WHILE e FOR
        * */

        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 20;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras: " + numeroDeClones);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("O Naruto fez um clone das sombras: " + i);
        }
    }
}
