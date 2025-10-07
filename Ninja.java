package NivelIntrermediario.Aula14;

public class Ninja {

    private final String nome;
    private final String email;
    private final int telefone;

    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
// Como os atributos são finals, não é possivel  colocar Setters para atribuir um novo valor.
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}