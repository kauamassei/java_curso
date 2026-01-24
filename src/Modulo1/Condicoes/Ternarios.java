package Modulo1.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: if else reduzido
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 9;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivelDoNinja);
    }
}
