package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner - uma forma de trazer o usuário pra dentro da aplicacao (input).
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do seu ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("O nome do ninja é " + nomeDoNinja + " e ele tem " + idadeDoNinja + " anos!");
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja é maior de idade e pode fazer missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é menor de idade e não pode sair da aldeia, precisa treinar mais.");
        }


        caixaDeTexto.close();
    }
}
