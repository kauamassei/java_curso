package Modulo2.Encapsulamento;

public class Main {
    public static void main(String[] args) {


        System.out.println("----------Naruto Uzumaki-----------");
        Uzumaki naruto = new Uzumaki("Naruto", "Vila da Folha", 18, 350, 1.78);
        System.out.println("Meu nome é " +naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome atualizado");
        System.out.println("Meu nome é " +naruto.getNome());
    }
}
