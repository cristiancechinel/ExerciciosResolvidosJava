public class TestaBiblioteca {
    
    public static void main(String[] args){
            
        Biblioteca bib = new Biblioteca();
        Livro liv = new Livro("X", "Y", 1998);
        bib.adicionaLivro(liv);
        
        Livro liv2 = new Livro("W", "Z", 1977);
        bib.adicionaLivro(liv2);
        
        bib.imprimeLivros();
        
        Livro result = bib.buscaLivro(1998);
        System.out.println("=======\n" + result);
        
    }
    
}
