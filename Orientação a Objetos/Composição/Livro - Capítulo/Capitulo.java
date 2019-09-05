
public class Capitulo{
    private String titulo;
    private String texto;

    Capitulo(String titulo, String texto){
        this.setTitulo(titulo);
        this.setTexto(texto);
    };

    public String getTitulo(){
        return this.titulo;
    };

    public void setTitulo(String titulo){
        this.titulo = titulo;
    };

    public String getTexto(){
        return this.texto;
    };

    public void setTexto(String texto){
        this.texto = texto;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": titulo = "+this.titulo+", texto = "+this.texto;
    }
}
