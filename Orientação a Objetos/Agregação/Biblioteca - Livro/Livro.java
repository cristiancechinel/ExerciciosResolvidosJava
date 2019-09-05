public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    
    Livro (String t, String a, int ano){
        this.titulo = t;
        this.autor = a;
        this.ano = ano;
    }
    
    int getAno(){
        return this.ano;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+ this.titulo + "\n"+
                "Autor: "+ this.autor  + "\n"+
                "Ano  : "+ this.ano+"\n";
    
    }
}
