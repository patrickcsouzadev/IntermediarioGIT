package NivelIntrermediario.Aula14;

public enum RankDeMissoes {
    D("Missão de baixo risco", 1),
    C("Missão de risco moderado", 2),
    B("Missão de risco alto", 3),
    A("Missão de alto risco", 4),
    S("Missão de risco extremo", 5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
