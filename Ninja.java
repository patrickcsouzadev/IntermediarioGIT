package NivelIntrermediario.Aula14;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chunnin, Jounin, Kage

    String nome;
    int aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 1.77;

    public Ninja(){
        // Construtor padrão (vazio)
    }

    //Primeiro metodo construtor
    public Ninja(String nome, int aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobre carga do construtor chamando os novos atributos
    // Sobre carga de metodos você não precisa redeclarar o construtor inteiro. Somente os novos atributos.

    public Ninja(String nome, int aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //metodos que todos ninjas devem ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essse é meu ataque especial");

    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Estratégia de batalha: " + nome);
    }

    //Sobrecarga de metodo - inteligencia de combate
    public void inteligenciaDeCombate() {
        System.out.println("Inteligencia de combate: " + nome);
    }

    //Sobrecarga de metodo - inteligencia de combate
    public void inteligenciaDeCombate(int QI) {
        if (QI >= 100) {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você é um gênio!!");
        } else if (QI > 80 && QI < 100) {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você é fora da curva!!");
        } else {
            System.out.println("Inteligencia de combate: " + nome + " - QI: " + QI + " Você esta na média!!");
        }
    }

    //TODO NINJA VAI FAZER
    final void tacarKunai(){
        System.out.println("Eu sou o método da classe mãe");
    }
}