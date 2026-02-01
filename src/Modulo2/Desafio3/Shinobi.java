package Modulo2.Desafio3;

public class Shinobi {
    String name;
    int age;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Nome: " +name);
        System.out.println("Idade: " + age);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                " | Idade: " + age +
                " | Missão: " + missao +
                " | Nível: " + nivelDificuldade +
                " | Status: " + statusMissao +
                " | Clã: " + getClass().getSimpleName();
    }

}
