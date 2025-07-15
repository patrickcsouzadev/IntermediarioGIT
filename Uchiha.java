package NivelIntrermediario.Aula14;

public class Uchiha extends Ninja {

    public Uchiha() {

        super();
    }

    public Uchiha(String nome, int aldeia, int idade) {

        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, int aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void sharinganAtivado() {

        System.out.println("Sharingan ativado");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){

        System.out.println("Estratégia de batalha: " + nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial: Katon Goukakyuu no Jutsu. Eu já completei " + numeroDeMissoesConcluidas + " missões e meu rank é " + rank + ".");
    }

    @Override
    public void inteligenciaDeCombate() {

        System.out.println("Inteligencia de combate: " + nome);
    }

    @Override
    public void inteligenciaDeCombate(int QI) {
        if (QI >= 100) {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você é um gênio!!");
        } else if (QI > 80 && QI < 100) {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você é fora da curva!!");
        } else {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você esta na média!!");
        }
    }
}