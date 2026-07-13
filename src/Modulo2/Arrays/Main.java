package Modulo2.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array
        //Sao estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        ninjasArray[3] = "Kakashi";

        System.out.println("Printando Array = " +ninjasArray[1]);

        //Array List
        //Dinamico, aumenta e diminui de tamanho

        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sasuke Uchiha");
        ninjaList.add("Sakura Haruno");
        ninjaList.add("Tobirama Senju");

        System.out.println("Lista de ninjas = " + ninjaList);

        //Adicionar na lista
        ninjaList.add("Kakashi Hatake");
        System.out.println("Lista de ninjas = " + ninjaList);

        //Remover da lista
        ninjaList.remove("Kakashi Hatake");
        System.out.println("Lista de ninjas = " + ninjaList);

        //Substituir elemento
        ninjaList.set(3, "Hashirama Senju");
        System.out.println("Lista de ninjas = " + ninjaList);

        //Ver o tamanho da lista
        System.out.println("Tamamnho da lista: " + ninjaList.size() + " elementos.");
    }
}
