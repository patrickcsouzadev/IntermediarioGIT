package NivelIntrermediario.Aula14;

public class Main {
    public static void main(String[] args) {

        //Objeto Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.aldeia = 1;
        Sasuke.idade = 30;
        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial();
        System.out.println(Sasuke);

        //Objeto Uchiha com sobrecarga
        Uchiha Itachi = new Uchiha("Itachi", 1, 30);
        Itachi.numeroDeMissoesConcluidas = 10;
        Itachi.rank = NivelNinja.JOUNNIN;

        //Objeto Uchiha 3
        Uchiha Madara = new Uchiha("Madara", 1, 30, 10, NivelNinja.KAGE);
        Madara.habilidadeEspecial();
        Madara.sharinganAtivado();
        Madara.inteligenciaDeCombate();

        //Objeto Uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.aldeia = 1;
        Naruto.idade = 30;
        Naruto.rank = NivelNinja.GENIN;
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();
        System.out.println("-------------");
        Naruto.tacarKunai();
        System.out.println("-------------");
        System.out.println(Naruto.altura);
        System.out.println("-------------");

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Anbu";
        ninjaAnbu.idade = 30;
    }
}