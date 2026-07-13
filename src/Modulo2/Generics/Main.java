package Modulo2.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho");

        BolsaEquipamentos<EquipamentosNinja> bolsaGenerica = new BolsaEquipamentos<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(shuriken);
        bolsaGenerica.adicionarEquipamento(pergaminho);

        System.out.println(bolsaGenerica);

    }
}
