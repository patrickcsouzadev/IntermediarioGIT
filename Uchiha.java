package NivelIntrermediario.Aula14;

public class Uchiha extends Ninja implements SharinganInterface {
        // refatoração de código. Criando cosntrutores.

    public Uchiha() {
    }

    public Uchiha(String nome, int aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, int aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Esse métodó é uma implementação do métodó da interface SharinganInterface.
    * */
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado!");
    }
}