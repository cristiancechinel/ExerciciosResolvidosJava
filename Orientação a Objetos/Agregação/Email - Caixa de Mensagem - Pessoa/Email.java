public class Email {
    private String texto;
    private String assunto;
    private Pessoa destinatario;
    private boolean lido; //indica se o email ja foi lido ou nao
    
    Email(String t, String a, Pessoa d, boolean l){
        setTexto(t);
        setAssunto(a);
        setPessoa(d);
        setLido(l);
    }
    
    String getTexto(){
        return this.texto;
    }
    Pessoa getPessoa(){
        return this.getPessoa();
    }
    String getAssunto(){
        return this.assunto;
    }
    
    boolean getLido(){
        return this.lido;
    }
    void setLido(boolean l){
        this.lido = l;
    }
    void setTexto(String t){
        this.texto = t;
    }
    void setAssunto(String a){
        this.assunto = a;
    }
    void setPessoa(Pessoa d){
        this.destinatario = d;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof String) return false;
        String aux = (String) o;
        return this.equals(aux);
    }
    @Override
    public String toString(){
        return "destinatario = " + this.destinatario.toString() + ", assunto = " + this.assunto + ", texto: = " + this.texto + ", lido = " + this.lido;
    }
}
