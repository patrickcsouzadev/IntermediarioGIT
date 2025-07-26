package NivelIntrermediario.Aula14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja espada = new EquipamentosNinja("Espada");
        EquipamentosNinja bombaDeFumaça = new EquipamentosNinja("Bomba de Fumaça");
        EquipamentosNinja bombaDeFogo = new EquipamentosNinja("Bomba de Fogo");
        EquipamentosNinja bombaDeGelo = new EquipamentosNinja("Bomba de Gelo");
        EquipamentosNinja bombaDeTinta = new EquipamentosNinja("Bomba de Tinta");

        BolsaGenerica<EquipamentosNinja> bolsaNinja = new BolsaGenerica<>(new ArrayList<>());
        bolsaNinja.adicionarEquipamentos(kunai);
        bolsaNinja.adicionarEquipamentos(shuriken);
        bolsaNinja.adicionarEquipamentos(espada);
        bolsaNinja.adicionarEquipamentos(bombaDeFumaça);
        bolsaNinja.adicionarEquipamentos(bombaDeFogo);
        bolsaNinja.adicionarEquipamentos(bombaDeGelo);
        bolsaNinja.adicionarEquipamentos(bombaDeTinta);

        System.out.println(bolsaNinja);


    }
}