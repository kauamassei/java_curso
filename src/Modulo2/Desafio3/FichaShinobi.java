package Modulo2.Desafio3;

import java.util.Scanner;

public class FichaShinobi {
    public static void main(String[] args) {

        Shinobi[] ninjas = new Shinobi[20];
        int ninjasCadastrados = 0;
        int opcoesMenu = 0;
        int opcoesCla;
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
                        System.out.println("Escolha o clã: ");
                        System.out.println("1. Uchiha");
                        System.out.println("2. Uzumaki");
                        System.out.println("3. Haruno");
                        System.out.println("4. Hyuuga");
                        opcoesCla = cadastro.nextInt();
                        cadastro.nextLine();

                        switch (opcoesCla) {
                            case 1:
                                Uchiha novoUchiha = new Uchiha();
                                System.out.println("Qual o nome do ninja? ");
                                novoUchiha.name = cadastro.nextLine();
                                System.out.println("Qual a idade do ninja? ");
                                novoUchiha.age = cadastro.nextInt();
                                cadastro.nextLine();
                                System.out.println("Qual a missão do ninja? ");
                                novoUchiha.missao = cadastro.nextLine();
                                System.out.println("Qual o rank da missão? ");
                                novoUchiha.nivelDificuldade = cadastro.nextLine();
                                System.out.println("Qual o status da missão? ");
                                novoUchiha.statusMissao = cadastro.nextLine();

                                ninjas[ninjasCadastrados] = novoUchiha;
                                ninjasCadastrados++;

                                System.out.println("Ninja cadastrado com sucesso!");
                                break;

                            case 2:
                                Uzumaki novoUzumaki = new Uzumaki();
                                System.out.println("Qual o nome do ninja? ");
                                novoUzumaki.name = cadastro.nextLine();
                                System.out.println("Qual a idade do ninja? ");
                                novoUzumaki.age = cadastro.nextInt();
                                cadastro.nextLine();
                                System.out.println("Qual a missão do ninja? ");
                                novoUzumaki.missao = cadastro.nextLine();
                                System.out.println("Qual o rank da missão? ");
                                novoUzumaki.nivelDificuldade = cadastro.nextLine();
                                System.out.println("Qual o status da missão? ");
                                novoUzumaki.statusMissao = cadastro.nextLine();

                                ninjas[ninjasCadastrados] = novoUzumaki;
                                ninjasCadastrados++;

                                System.out.println("Ninja cadastrado com sucesso!");
                                break;

                            case 3:
                                Haruno novoHaruno = new Haruno();
                                System.out.println("Qual o nome do ninja? ");
                                novoHaruno.name = cadastro.nextLine();
                                System.out.println("Qual a idade do ninja? ");
                                novoHaruno.age = cadastro.nextInt();
                                cadastro.nextLine();
                                System.out.println("Qual a missão do ninja? ");
                                novoHaruno.missao = cadastro.nextLine();
                                System.out.println("Qual o rank da missão? ");
                                novoHaruno.nivelDificuldade = cadastro.nextLine();
                                System.out.println("Qual o status da missão? ");
                                novoHaruno.statusMissao = cadastro.nextLine();

                                ninjas[ninjasCadastrados] = novoHaruno;
                                ninjasCadastrados++;

                                System.out.println("Ninja cadastrado com sucesso!");
                                break;

                            case 4:
                                Hyuuga novoHyuuga = new Hyuuga();
                                System.out.println("Qual o nome do ninja? ");
                                novoHyuuga.name = cadastro.nextLine();
                                System.out.println("Qual a idade do ninja? ");
                                novoHyuuga.age = cadastro.nextInt();
                                cadastro.nextLine();
                                System.out.println("Qual a missão do ninja? ");
                                novoHyuuga.missao = cadastro.nextLine();
                                System.out.println("Qual o rank da missão? ");
                                novoHyuuga.nivelDificuldade = cadastro.nextLine();
                                System.out.println("Qual o status da missão? ");
                                novoHyuuga.statusMissao = cadastro.nextLine();

                                ninjas[ninjasCadastrados] = novoHyuuga;
                                ninjasCadastrados++;

                                System.out.println("Ninja cadastrado com sucesso!");
                                break;
                        }
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

        Uchiha Madara = new Uchiha();
        Madara.name = "Madara Uchiha";
        Madara.age = 30;
        Madara.missao = "Realizar o Tsukuyomi";
        Madara.nivelDificuldade = "S";
        Madara.statusMissao = "Concluída";
        Madara.mostrarInformacoes();


        cadastro.close();
    }
}
