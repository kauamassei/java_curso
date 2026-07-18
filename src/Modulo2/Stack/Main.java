package Modulo2.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array - são estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        System.out.println(ninjasArray[0]);

        //Listas - são dinâmicas e o tamanho aumenta ou diminui conforme a necessidade
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        System.out.println(ninjaList);

        //Stack - o último elemento a entrar é o primeiro a sair)
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Hinata Hyuuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack Atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjaStack);
        System.out.println("Minha Stack com próximo elemento da lista: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size());


    }
}
