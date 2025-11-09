package NivelIntrermediario.Aula14;

import java.lang.classfile.instruction.NopInstruction;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        //São estaticos e tem referencia de memória (temos que definir o tamanho do array).
        System.out.println("----------------Arrays----------------");
        String [] ninjasArray = new String[3];
        ninjasArray[0] = "1";
        ninjasArray[1] = "2";
        ninjasArray[2] = "3";
        System.out.println("Nome do ninja 1 = " + ninjasArray[0]);
        System.out.println("Nome do ninja 2 = " + ninjasArray[1]);

        //Listas
        //São dinamicas e tamanho aumenta ou diminui conforme adicionamos ou removemos elementos.
        //Podemos usar ArrayList, LinkedList, etc.
        //Lista é um pouco mais lenta que o array, mas é mais flexivel.

        System.out.println("----------------Listas----------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("1");
        ninjasList.add("2");
        ninjasList.add("3");
        ninjasList.add("4");
        System.out.println("Minha Lista: " + ninjasList);

        //Stack (Pilha)
        //Exigem uma ordem! O ultimo que entra é o primeiro que sai (LIFO - Last In, First Out).
        //O ultimo elemento que entrou é obrigatoriamente o primeiro a sair.
        //Não deixa retirar qualquer elemento, só o ultimo que entrou.
        System.out.println("----------------Stack----------------");
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Minato");
        ninjasStack.push("Kakashi");
        ninjasStack.pop();
        System.out.println("Minha Stack: " + ninjasStack);

        // QUEUE = FILAS
        //Exigem uma ordem! O primeiro que entra é o primeiro que sai (FIFO - First In, First Out).
        //O primeiro elemento que entrou é obrigatoriamente o primeiro a sair.
        //Não deixa retirar qualquer elemento, só o primeiro que entrou.
        //E o inverso de uma STACK(PILHA).
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Minato");
        ninjasQueue.add("Kakashi");
        System.out.println("Minha Queue: " + ninjasQueue);
        ninjasQueue.poll(); //remove o primeiro elemento da fila
        ninjasQueue.peek(); //mostra o primeiro elemento da fila sem remover
        System.out.println("Ninja do topo: " + ninjasQueue.peek());
        ninjasQueue.add("Jiraya");
        System.out.println("Minha Queue após alterações: " + ninjasQueue);
        if (ninjasStack.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha não está vazia.");
        }
    }
}