package Modulo2.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado() {

    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome +
                ", Idade: " + idade +
                ", Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade especial é: " + habilidade);
    }
}
