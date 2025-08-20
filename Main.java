package NivelIntrermediario.Aula14;

import java.lang.classfile.instruction.NopInstruction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Array
        //São estaticos e tem referencia de memória (temos que definir o tamanho do array).
        String [] ninjasArray = new String[3];

        //Listas
        //São dinamicas e tamanho aumenta ou diminui conforme adicionamos ou removemos elementos.
        //Podemos usar ArrayList, LinkedList, etc.
        List<String> ninjasList = new ArrayList<>();

        //Stack
        //O ultimo elemento que entrou é obrigatoriamente o primeiro a sair.
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Minato");
        ninjasStack.push("Kakashi");
        ninjasStack.pop();
        System.out.println("Minha Stack: " + ninjasStack);
    }
}