import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> colecao;
    
    Biblioteca(){
        this.colecao = new ArrayList<Livro>();
    }
    
    void adicionaLivro(Livro liv){
        this.colecao.add(liv);
    }
    
    Livro buscaLivro(int ano){
        for (Livro liv: this.colecao){
            if (liv.getAno() == ano) return liv;
        }
        return null;
    }
    
    void imprimeLivros(){
        for (Livro liv: this.colecao)
            System.out.println(liv);
    }
}
