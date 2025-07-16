package NivelIntrermediario.Aula14;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------- Naruto Uzumaki -------------");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 1, 30, 10, NivelNinja.GENIN, Biju.KURAMA);
        System.out.println(Naruto.biju);
        Naruto.habilidadeEspecial();


        System.out.println("------------- Sasuke Uchiha -------------");


        Uchiha Sasuke = new Uchiha("Sasuke", 1, 30, 10, NivelNinja.GENIN);
        Sasuke.habilidadeEspecial();


        System.out.println("------------- Itachi Uchiha -------------");

        Uchiha Itachi = new Uchiha("Itachi", 1, 30, 10, NivelNinja.JOUNNIN);
        Itachi.habilidadeEspecial();


        System.out.println("------------- Madara Uchiha -------------");

        Uchiha Madara = new Uchiha("Madara", 1, 30, 10, NivelNinja.KAGE);
        Madara.habilidadeEspecial();
        Madara.estrategiaDeBatalhaNinja();
        Madara.inteligenciaDeCombate();
        Madara.inteligenciaDeCombate(90);
        System.out.println("-------------");
    }
}