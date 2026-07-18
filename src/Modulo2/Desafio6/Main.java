package Modulo2.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        //Listar ninjas
//        for (int i = 0; i < listDeNinjas.size() ; i++) {
//            System.out.println(listDeNinjas.get(i));
//        }
//
//        //Adicionar ninja no inicio
//        listDeNinjas.addFirst(new Ninja("Kankuro", 18, "Areia"));
//
//        //Remover o primeiro
//        listDeNinjas.removeFirst();
//
//        //Acessar posicão
//        Ninja ninjaProcurado = listDeNinjas.get(3);
//        System.out.println("Ninja: " + ninjaProcurado);
//
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcoesMenu = 0;

        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Adicionar Novo Ninja no inicio");
            System.out.println("2. Exibir Lista de Ninjas");
            System.out.println("3. Exibir Ninja Pelo Indice");
            System.out.println("4.Reordenar a Lista");
            System.out.println("5.Remover Ninja pelo Indice");
            System.out.println("6.Remover Ninja do Inicio");
            System.out.println("7.Buscar Pelo Nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcoesMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcoesMenu) {
                case 1:
                    System.out.println("Digite o nome do Ninja:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do Ninja:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a vila de origem do Ninja:");
                    String vila = scanner.nextLine();
                    listDeNinjas.addFirst(new Ninja(nome, idade, vila));
                    System.out.println("Ninja adicionado com sucesso!");

                    break;
                case 2:
                    for (Ninja ninja : listDeNinjas) {
                        System.out.println(ninja);
                    }

                    break;
                case 3:
                    System.out.println("Digite o índice que deseja procurar:");
                    int indice = scanner.nextInt();
                    System.out.println(listDeNinjas.get(indice));
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Digite o indice que deseja remover:");
                    int ind = scanner.nextInt();
                    System.out.println("Tem certeza que deseja remover: " + listDeNinjas.get(ind) + " ?");
                    System.out.println("1 - SIM \n 2 - NÃO");
                    int resposta = scanner.nextInt();
                    if (resposta == 1) {
                        System.out.println("Ninja removido: " + listDeNinjas.get(ind));
                        listDeNinjas.remove(ind);
                    } else if (resposta == 2) {
                        System.out.println("Nenhum ninja foi removido");
                    } else {
                        System.out.println("Escolha uma opcão válida!");
                    }
                    break;
                case 6:
                    System.out.println("Tem certeza que deseja remover o primeiro ninja da lista?" );
                    System.out.println("1 - SIM \n 2 - NÃO");
                    int respostaD = scanner.nextInt();
                    if (respostaD == 1) {
                        System.out.println("Ninja removido: " + listDeNinjas.getFirst());
                        listDeNinjas.removeFirst();
                    } else if (respostaD == 2) {
                        System.out.println("Nenhum ninja foi removido");
                    } else {
                        System.out.println("Escolha uma opcão válida!");
                    }
                    break;
            }

        } while (opcoesMenu != 0);


    }
}
