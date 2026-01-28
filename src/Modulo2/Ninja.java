package Modulo2;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // criando métodos

    //void
    public void SharinganAtivado() {
        System.out.println("O sharingan ativou!");
    }

    //String
    public String EuSouUmNinja() {
        return "Eu sou um ninja!";
    }

    public int anosHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
