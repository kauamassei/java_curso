package Modulo1.Exerc;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = inputNumber.nextInt();
        System.out.println("----------------");

        for (int i = 0; i < numero; i++) {

            System.out.println(i + 1);
        }
    }
}
