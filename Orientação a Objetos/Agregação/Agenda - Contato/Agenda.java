import java.util.*;

public class Agenda {
    private ArrayList<Contato> lista;
    
    Agenda(){
        this.lista = new ArrayList<Contato>();
    }
    
    void remove2(Contato c){
        this.lista.remove(c);
    }
    
    void remover(String t){
        int pos = -1;
        for (int i = 0; i < this.lista.size(); i++){
            if (this.lista.get(i).getTelefone() == t) {
                pos = i;
                break;
            }        
        }
        if (pos != -1) this.lista.remove(pos);
    }
    
    void cadastrar(Contato c){
        //boolean adiciona = true;
        /*for (Contato x: this.lista){
            if (x.getTelefone() == c.getTelefone()) {
                adiciona = false;
                break;
            }
        }*/
        //if (adiciona) this.lista.add(c);
        if (!this.lista.contains(c)) this.lista.add(c);
        
    }
    
    void imprimirAgenda(){
        for (Contato c: this.lista){
            System.out.println(c);
        }
    }
    @Override
    public String toString(){
        String result = " ";
        for (Contato c: this.lista) {
            result+= c.toString();
        }
        return result;
    }
}
