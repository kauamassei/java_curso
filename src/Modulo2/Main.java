package Modulo2;

public class Main {
    public static void main(String[] args) {

        //Criando um objeto Sasuke e Sakura a partir da classe Ninja
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Vila da Folha";
        Sakura.idade = 19;
        Sakura.AtivarCura();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.idade = 19;
        Sasuke.SharinganAtivado();


        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Vila da Folha";
        Naruto.idade = 19;
        Naruto.ModoSennin();

        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Vila da Folha";
        Hinata.idade = 19;
        Hinata.AtivarByakugan();
    }
}
