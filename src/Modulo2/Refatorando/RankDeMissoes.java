package Modulo2.Refatorando;

public enum RankDeMissoes {
    D("Muito Baixo", 2),
    C("Baixo", 3),
    B("Moderado", 4),
    A("Alto", 5),
    S("Muito Alto", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
