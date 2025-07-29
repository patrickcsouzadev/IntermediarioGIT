package NivelIntrermediario.Aula14;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T> {

    // inicialiar o arraylist
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas no array (bolsa)
    public void adicionarFerramentas(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //mostrar a lista de ferramentas
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
