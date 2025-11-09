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
        System.out.println("Ninja List: " + ninjaList);

        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.addAll(ninjaList);
        System.out.println("Ninja Set: " + ninjaSet);
    }
}