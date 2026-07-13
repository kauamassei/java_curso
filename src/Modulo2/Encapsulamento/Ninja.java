package Modulo2.Encapsulamento;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluídas;
    private double altura = 2.10;

    public Ninja() {

    }
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluídas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluídas = numeroDeMissoesConcluídas;
        this.altura = altura;
    }

    // tirar dados ou retornar para usuário eu uso o GET + NOME da variável
    public String getNome() {
        return nome;
    }

    //Setter recebe valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    // com atalho Ctrl + N


    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluídas() {
        return numeroDeMissoesConcluídas;
    }

    public void setNumeroDeMissoesConcluídas(int numeroDeMissoesConcluídas) {
        this.numeroDeMissoesConcluídas = numeroDeMissoesConcluídas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
