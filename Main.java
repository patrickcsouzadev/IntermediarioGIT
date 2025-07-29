package NivelIntrermediario.Aula14;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        // Adicionando equipamentos ninja
        bolsaNinja.adicionarFerramentas(new Shuriken(10));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invicação do SAPO!"));
        bolsaNinja.adicionarFerramentas(new Kunai("Kunai de 10 metros"));
    }
}