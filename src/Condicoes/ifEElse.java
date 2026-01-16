package Condicoes;

public class ifEElse {

    public static void main(String[] args) {

        /*
        * IF e ELSE
        * Objetivo: passar o ninja de nivel de acordo com numero de missoes
        * */
        String name = "Naruto";
        int age = 10;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        if(numeroDeMissoes == 20 && age > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
