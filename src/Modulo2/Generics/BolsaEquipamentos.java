package Modulo2.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaEquipamentos<T>  {

    private List<T> equipamentos;

    public BolsaEquipamentos() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamento(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
