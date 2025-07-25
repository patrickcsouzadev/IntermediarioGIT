package NivelIntrermediario.Aula14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Missoes missaso1 = new Missoes("Resgatar cachorro, ", RankDeMissoes.D);
        missaso1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza, ", RankDeMissoes.B);
        missao2.exibirDetalhes();

        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[2] = "Sasuke";
        ninjasArray[1] = "Sakura";
        System.out.println("Ninjas Array:" + ninjasArray);


        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Kakashi");

        System.out.println("Ninjas List:" + ninjasList);

        //removendo um ninja da lista
        ninjasList.remove("Naruto");
        System.out.println("Ninjas List após remoção:" + ninjasList);

        //Trocando um ninja na lista
        ninjasList.set(0, "Hinata");
        System.out.println("Ninjas List após troca:" + ninjasList);

        //Ver o tamanho da lista
        ninjasList.size();
        System.out.println("Tamanho da lista de ninjas: " + ninjasList.size());
    }
}