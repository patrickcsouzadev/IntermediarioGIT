package NivelIntrermediario.Aula14;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, int aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, int aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Construtor com sobre carga do atributo Biju que foi adicionado direto nessa classe.
    public Uzumaki(String nome, int aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki!! Um ataque de ar");
    }
}