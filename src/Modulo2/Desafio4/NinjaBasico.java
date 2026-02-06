package Modulo2.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {

    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome +
                ", Idade: " + idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade especial é: " + habilidade);
    }
}
