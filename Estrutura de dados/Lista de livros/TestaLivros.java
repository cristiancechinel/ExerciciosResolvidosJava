
public class TestaLivros{

    public static void main(String args[]){
        Biblioteca bib = new Biblioteca();

        Livro liv = new Livro("Teste", 2017);
        Livro liv2 = new Livro("Novo", 2000);
        //adicionar os livros na listalivros
        bib.adicionaLivro(liv);
        bib.adicionaLivro(liv2);

        //listar os livros

        bib.listagemLivros();

        Livro retorno = bib.buscaPorAno(2017);
        System.out.println(retorno);

    }
}
