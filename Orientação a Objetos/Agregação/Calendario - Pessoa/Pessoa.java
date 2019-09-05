public class Pessoa {
    private String nome;
    private int idade; 
    private Calendario dataNascimento;
    
    Pessoa (String n, int i, Calendario data){
        this.nome = n;
        this.idade = i;
        this.dataNascimento = data;
    }
    
    void setNome(String n){
        this.nome = n;
    }
    void setIdade (int i){
        this.idade = i;
    }
    void setDataNascimento(Calendario data){
        this.dataNascimento = data;
    }
    String getNome(){
        return this.nome;
    }
    int getIdade(){
        return this.idade;
    }
    Calendario getDataNascimento(){
        return this.dataNascimento;
    }
    
    @Override
    public String toString(){
        return this.nome + " tem "+ this.idade + " anos e nasceu em "+ this.dataNascimento.toString();    
    }
}
