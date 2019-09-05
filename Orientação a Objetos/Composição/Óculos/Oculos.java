
public class Oculos{
    private float preco;
    private String cor;
    private Lente lente;

    Oculos(float preco, String cor, String tipoLente, float grauLente){
        this.setPreco(preco);
        this.setCor(cor);
        this.setLente(new Lente(tipoLente, grauLente));
    };

    public void setPreco(float preco){
        this.preco = preco;
    };

    public float getPreco(){
        return this.preco;
    };

    public void setCor(String cor){
        this.cor = cor;
    };

    public String getCor(){
        return this.cor;
    };

    public void setLente(Lente lente){
        this.lente = lente;
    };

    public Lente getLente(){
        return this.lente;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": preco = " + this.preco + ", cor = " + this.cor + ",\nlente = " + this.lente.toString();
    };
}
