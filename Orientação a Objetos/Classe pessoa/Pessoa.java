
public class Pessoa {
    public String nome;
    public int idade;

    Pessoa(String nome) {
        this.nome = nome;
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        idade++;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": nome = " + nome +", idade = " + idade;
    }
}
