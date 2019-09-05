import java.util.ArrayList;

public class CaixaDeMensagem {
    private ArrayList<Email> listaDeEmails;
    
    CaixaDeMensagem(){
        listaDeEmails = new ArrayList<Email>();
    }
    void adicionaEmail(Email novo){
        listaDeEmails.add(novo);
    }
    void listaLidos(){
        for (Email e: listaDeEmails){
            if (e.getLido()){
                System.out.println(e);
            }
        }
    }
}
