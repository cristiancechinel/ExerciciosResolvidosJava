
public class Mensagem{
    private String texto;
    private Contato destinatario;
    private Contato remetente;

    Mensagem(String texto, Contato destinatario, Contato remetente){
        this.setTexto(texto);
        this.setDestinatario(destinatario);
        this.setRemetente(remetente);
    };

    public void setTexto(String texto){
        this.texto = texto;
    };

    public String getTexto(){
        return this.texto;
    };

    public void setDestinatario(Contato destinatario){
        this.destinatario = destinatario;
    };

    public Contato getDestinatario(){
        return this.destinatario;
    };

    public void setRemetente(Contato remetente){
        this.remetente = remetente;
    };

    public Contato getRemetente(){
        return this.remetente;
    };

    @Override
    public String toString(){
        return this.getClass().getName() +": texto = "+this.texto+",\ndestinatario = "+this.destinatario.toString()+",\nremetente = "+this.remetente.toString();
    }
}
