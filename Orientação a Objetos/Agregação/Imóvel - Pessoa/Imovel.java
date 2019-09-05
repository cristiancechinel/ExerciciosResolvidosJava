
public class Imovel{
    private int valor;
    private int area;
    private String tipo;
    private Pessoa proprietario;
    private Pessoa morador;

    Imovel(int valor, int area, String tipo, Pessoa proprietario, Pessoa morador){
        this.setValor(valor);
        this.setArea(area);
        this.setTipo(tipo);
        this.setProprietario(proprietario);
        this.setMorador(morador);
    };

    public void setValor(int valor){
        this.valor = valor;
    };

    public int getValor(){
        return this.valor;
    };

    public void setArea(int area){
        this.area = area;
    };

    public int getArea(){
        return this.area;
    };

    public void setTipo(String tipo){
        this.tipo = tipo;
    };

    public String getTipo(){
        return this.tipo;
    };

    public void setProprietario(Pessoa proprietario){
        this.proprietario = proprietario;
    };

    public Pessoa getProprietario(){
        return this.proprietario;
    };

    public void setMorador(Pessoa morador){
        this.morador = morador;
    };

    public Pessoa getMorador(){
        return this.morador;
    };

    @Override
    public String toString(){
        return this.getClass().getName() +": valor = "+this.valor+", area = "+this.area+", tipo = "+this.tipo+",\nproprietario = "+this.proprietario.toString()+",\nmorador = "+this.morador.toString();
    }
}
