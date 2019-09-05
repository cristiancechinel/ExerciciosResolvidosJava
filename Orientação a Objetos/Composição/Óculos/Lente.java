
public class Lente{
    private String tipo;
    private float grau;

    Lente(String tipo, float grau){
        this.setTipo(tipo);
        this.setGrau(grau);
    };

    public void setTipo(String tipo){
        this.tipo = tipo;
    };

    public String getTipo(){
        return this.tipo;
    };

    public void setGrau(float grau){
        this.grau = grau;
    };

    public float getGrau(){
        return this.grau;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": tipo = " + this.tipo + ", grau = " + this.grau;
    };
}
