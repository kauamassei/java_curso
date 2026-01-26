package Modulo1.Exerc;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        int senhaPadrao = 0;

        while (senhaPadrao != 1234) {
            System.out.println("Digite a senha: ");
            senhaPadrao = passwordInput.nextInt();

            if (senhaPadrao == 1234) {
                System.out.println("Senha correta!");
            } else {
                System.out.println("Tente novamente");
            }
        }

        passwordInput.close();
    }
}
