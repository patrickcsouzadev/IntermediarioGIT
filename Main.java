package NivelIntrermediario.Aula14;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------- Naruto Uzumaki ----------------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 100, 1.80);
        System.out.println("Meu nome é: " + Naruto.getNome()); // pegando o nome do atributo através do métodó GET
        Naruto.setNome("Naruto Uzumaki alterado"    ); // mudando o nome do atributo através do métodó SET
        System.out.println("Meu nome é: " + Naruto.getNome());


        System.out.println("---------------- Sasuke Uchiha ----------------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 100, 1.80);

    }
}