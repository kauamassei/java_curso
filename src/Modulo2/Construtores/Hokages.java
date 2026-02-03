package Modulo2.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Vivo: " + vivoOuMorto;
    }
}
