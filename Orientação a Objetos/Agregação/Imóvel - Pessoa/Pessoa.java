
public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;

    Pessoa(String nome, int idade, String cpf){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getNome(){
        return this.nome;
    };

    public void setIdade(int idade){
        this.idade = idade;
    };

    public int getIdade(){
        return this.idade;
    };

    public void setCpf(String cpf){
        this.cpf = cpf;
    };

    public String getCpf(){
        return cpf;
    };

    @Override
    public String toString(){
        return this.getClass().getName() +": nome = "+this.nome+", idade = "+this.idade+", cpf = "+this.cpf;
    }
}
