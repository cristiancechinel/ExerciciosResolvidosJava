
public class Tinta{
    private String nome;
    private int preco;
    private boolean provaDagua;
    private Cor cor;

    Tinta(String nome, int preco, boolean provaDagua, Cor cor){
        this.setNome(nome);
        this.setPreco(preco);
        this.setProvaDagua(provaDagua);
        this.setCor(cor);
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getNome(){
        return this.nome;
    };

    public void setPreco(int preco){
        this.preco = preco;
    };

    public int getPreco(){
        return this.preco;
    };

    public void setProvaDagua(boolean provaDagua){
        this.provaDagua = provaDagua;
    };

    public boolean getProvaDagua(){
        return this.provaDagua;
    };

    public void setCor(Cor cor){
        this.cor = cor;
    };

    public Cor getCor(){
        return this.cor;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": nome = " + this.nome + ", preco = " + this.preco + ", provaDagua = " + this.provaDagua + ",\ncor = " + this.cor.toString();
    };
}
