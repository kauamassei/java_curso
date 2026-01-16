package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * SwitchCases: servem para gerar casos específicos
        * */

        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sakura Haruno");
        System.out.println("3 - Sasuke Uchiha");

        //usuario escolher
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        // Reacao ao escolher um dos números

        switch (escolhaDoUsuario) /*motivador*/ {
            case 1:
                System.out.println("O usuário escolheu Naruto Uzumaki, o próximo hokage.");
                break;
            case 2:
                System.out.println("O usuário escolheu a Sakura Haruno, a personagem mais foda.");
                break;
            case 3:
                System.out.println("O usuário escolheu Sasuke Uchiha, o ninja mais revoltado.");
                break;

            default:
                System.out.println("Você não digitou uma resposta válida, tente denovo.");
        }

        //fechar a caixa
        scanner.close();
    }
}
