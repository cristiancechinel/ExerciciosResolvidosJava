
public class Contato{
    private String nome;
    private int numero;
    private int ddd;

    Contato(String nome, int numero, int ddd){
        this.setNome(nome);
        this.setNumero(numero);
        this.setDdd(ddd);
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getNome(){
        return this.nome;
    };

    public void setNumero(int numero){
        this.numero = numero;
    };

    public int getNumero(){
        return this.numero;
    };

    public void setDdd(int ddd){
        this.ddd = ddd;
    };

    public int getDdd(){
        return this.ddd;
    };

    @Override
    public String toString(){
        return this.getClass().getName() +": nome = "+this.nome+", numero = "+this.numero+", ddd = "+this.ddd;
    }
}
