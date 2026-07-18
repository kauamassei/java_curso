package Modulo2.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");
        // Mostrando a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois dol poll: " + ninjasQueue);

        // Ver o primeiro da fila
        System.out.println("Ninja no head: " + ninjasQueue.peek());
        
        // Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }
    }
}
