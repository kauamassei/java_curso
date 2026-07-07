package Modulo2.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        //Metodos abstratos
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 42;
        Hashirama.Apresentacao();
        Hashirama.SabedoriaHokage();
        Hashirama.PoderDeHokage();

        //Interface
        Uchiha Madara = new Uchiha();
        Madara.nome = "Madara Uchiha";
        Madara.idade = 42;
        Madara.estrategiaDeBatalhaNinja();
        Madara.sharinganAtivado();

        //Construtores
        Uchiha Itachi = new Uchiha("Itachi Uchiha", 27, "Vila da Folha");
        Itachi.estrategiaDeBatalhaNinja();
        Itachi.sharinganAtivado();
        Itachi.ninjaDeElite();

        //Heranca multipla
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "Aldeia da Folha";
        Kakashi.idade = 36;
        Kakashi.Greeting();
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();

        //Sobrecarga de construtores
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 18, "Vila da Folha", 200, NivelNinja.GENIN);
        Sasuke.estrategiaDeBatalhaNinja();
        Sasuke.inteligenciaDeCombate(50);
        System.out.println(Sasuke);





    }
}
