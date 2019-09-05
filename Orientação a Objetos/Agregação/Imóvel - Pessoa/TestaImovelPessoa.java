
public class TestaImovelPessoa {
    public static void main(String args[]){
        Pessoa pessoa1 = new Pessoa("Ana",20,"102.000.006-00");
        Pessoa pessoa2 = new Pessoa("Maria",20,"103.000.006-00");
        Imovel imovel = new Imovel(300000,100,"apartamento",pessoa1,pessoa2);
        System.out.println(imovel.toString());
    }
}
