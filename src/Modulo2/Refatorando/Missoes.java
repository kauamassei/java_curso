package Modulo2.Refatorando;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public void exibirMissao() {
        System.out.println("Missão: " + nome + " - Rank: " + rank + " (Descricão: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
