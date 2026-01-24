package Modulo1.Exerc;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = inputAge.nextInt();

        if (age < 18) {
            System.out.println("Você é menor de idade.");
        } else if (age > 59) {
            System.out.println("Você é idoso.");
        } else {
            System.out.println("Você é adulto.");
        }
    }
}
