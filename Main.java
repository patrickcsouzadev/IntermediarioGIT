package NivelIntrermediario.Aula14;

import java.lang.classfile.instruction.NopInstruction;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Naruto");
        ninjaList.add("Sakura");
        ninjaList.add("Kakashi");
        ninjaList.add("Boruto");
        System.out.println("Ninja List: " + ninjaList);

        Set<String> ninjaSet = new TreeSet<>(); // implementação de Set que ordena os elementos
        ninjaSet.addAll(ninjaList);
        System.out.println("Lista Ninja com TreeSet: " + ninjaSet);

        Set<String> ninjaSet2 = new LinkedHashSet<>(); // implementação de Set que mantém a ordem de inserção
        ninjaSet2.addAll(ninjaList);
        System.out.println("Lista Ninja com LinkedHashSet: " + ninjaSet2);
    }
}