public class Livro {
	private String titulo;
    private int ano;
    
    void setTitulo(String t){
        this.titulo = t;
    }
    void setAno (int a){
        this.ano = a;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getAno(){
        return this.ano;
    }
    public Livro(String t, int a){
        this.titulo = t;
        this.ano = a;
    }

    @Override
    public String toString(){
        return this.titulo + " "+ this.ano;

    }
}