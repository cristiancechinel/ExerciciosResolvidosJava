import java.util.*;

public class TestaCaixaDeMensagem {
 
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Pessoa p = new Pessoa("joao");
        Email e = new Email("oi", "saudacao", p, true);
        CaixaDeMensagem cm = new CaixaDeMensagem();
        cm.adicionaEmail(e);
        cm.listaLidos();
        
    }
}
