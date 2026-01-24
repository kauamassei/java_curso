package Modulo1.Arrays;

public class Array {

    public static void main(String[] args) {

        //inicia como null

        //Declarando Array
        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sakura Haruno";
        ninja[2] = "Sasuke Uchiha";
        ninja[3] = "Hyuuga Hinata";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[3]);

        //Redeclarando Array

        ninja = new String[7];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";

        // Exibindo todos os itens
        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninja[i]);
        }


        //inicia como 0
        int[] idade = new int[2];
        idade[0] = 1;
        idade[1] = 2;
        System.out.println(idade[1]);

        //inicia como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

    }
}
