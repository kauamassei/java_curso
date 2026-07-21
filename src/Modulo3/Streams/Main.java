package Modulo3.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Vila da Folha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Vila da Folha", 20));
        ninjas.add(new Ninja("Hinata Hyuuga", "Vila da Folha", 25));
        ninjas.add(new Ninja("Gaara", "Vila da Areia", 29));
        ninjas.add(new Ninja("Temari", "Vila da Areia", 32));

        //.stream - filtragem
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Vila da Areia"))
                .forEach(System.out::println);

        //ordenacão por idade
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        // ordenacão por nome
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        // MAP - mostrar e mapear atributos
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        // MAX - filtrar por ninja mais velho
        Ninja ninjaMisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println("Filtro de ninja mais velho: " + ninjaMisVelho);


    }
}
