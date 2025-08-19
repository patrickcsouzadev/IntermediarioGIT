package NivelIntrermediario.Aula14;

import java.lang.classfile.instruction.NopInstruction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Ninja cadastroNinja = new Ninja("Naruto", "naruto@gmail", 999999999);
        System.out.println("Cadastro =" + cadastroNinja);

        NinjaRecord cadastroNinjaRecord = new NinjaRecord("Naruto", "naruto@gmail", 999999999);
        System.out.println("Cadastro Record =" + cadastroNinjaRecord);
    }
}