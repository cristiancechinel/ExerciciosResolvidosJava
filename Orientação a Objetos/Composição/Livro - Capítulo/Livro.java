
public class Livro{
    private String nome;
    private String autor;
    private Capitulo capitulo1;
    private Capitulo capitulo2;

    Livro(String nome, String autor, String tituloCap1, String textoCap1, String tituloCap2, String textoCap2){
        this.setNome(nome);
        this.setAutor(autor);
        this.setCapitulo1(new Capitulo(tituloCap1, textoCap1));
        this.setCapitulo2(new Capitulo(tituloCap2, textoCap2));
    };

    public String getNome(){
        return this.nome;
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getAutor(){
        return this.autor;
    };

    public void setAutor(String autor){
        this.autor = autor;
    };

    public Capitulo getCapitulo1(){
        return this.capitulo1;
    };

    public void setCapitulo1(Capitulo capitulo){
        this.capitulo1 = capitulo;
    };

    public Capitulo getCapitulo2(){
        return this.capitulo2;
    };

    public void setCapitulo2(Capitulo capitulo){
        this.capitulo2 = capitulo;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": nome = "+this.nome+", autor = "+this.autor+",\ncapitulo 1 = "+this.capitulo1.toString()+",\ncapitulo 2 = "+this.capitulo2.toString();
    }
}
