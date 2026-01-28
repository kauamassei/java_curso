package Modulo2;

public class Main {
    public static void main(String[] args) {

        String nome = "Sasuke Uchiha";
        int idade = 19;
        String aldeia = "Vila da Folha";
        System.out.println(nome + " - " + idade + " anos - " + aldeia);

        //Criando um objeto Sasuke e Sakura a partir da classe Ninja
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.idade = 19;

        //Apliccando métodos ao meu objeto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosHokage(35);
        System.out.println("Você tem: " + Sasuke.idade + " anos, e faltam: " +quantoTempoFalta+ " anos para se tornar hokage.");

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Vila da Folha";
        Sakura.idade = 19;
    }
}
