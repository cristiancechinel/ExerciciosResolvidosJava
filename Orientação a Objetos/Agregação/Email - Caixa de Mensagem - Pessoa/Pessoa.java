public class Pessoa {
    private String nome;

    Pessoa(String n){
        setNome(n);
    }
    void setNome(String n){
        this.nome = n;
    }
    String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
