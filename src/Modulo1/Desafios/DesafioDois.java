package Modulo1.Desafios;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {

        String[] ninjas = new String[20];
        int ninjasCadastrados = 0;
        int opcoesMenu = 0;
        Scanner cadastro = new Scanner(System.in);

        while (opcoesMenu != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcoesMenu = cadastro.nextInt();
            cadastro.nextLine();

            switch (opcoesMenu) {
                case 1:
                    if (ninjasCadastrados < 20) {
                        System.out.println("Cadastre o nome de um ninja: ");
                        String nomeNinja = cadastro.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite de ninjas atingido.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados > 0) {
                        System.out.println("Lista de Ninjas");
                        for (int i = 0; i < ninjasCadastrados ; i++) {
                            System.out.println("- " + ninjas[i]);
                        }
                    } else {
                        System.out.println("Nenhum ninja cadastrado");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar o sistema.");
                    break;
                default:
                    System.out.println("Escolha uma opcao válida!");
            }
        }
        cadastro.close();
    }
}