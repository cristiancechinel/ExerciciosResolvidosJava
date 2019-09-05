public class Contato {
    private String nome;
    private String email;
    private String telefone;
    
    Contato(String n, String e, String t){
        setNome(n);
        setEmail(e);
        setTelefone(t);
    }
    //sets e gets
    String getNome(){
        return this.nome;
    }
    String getEmail(){
        return this.email;
    }
    String getTelefone(){
        return this.telefone;
    }
    void setNome(String n){
        this.nome = n;
    }
    void setEmail(String e){
        this.email = e;
    }
    void setTelefone(String t){
        this.telefone = t;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato c = (Contato) o;
        return this.email.equals(c.email) && 
               this.telefone.equals(c.telefone); 
    }
    
    @Override
    public String toString(){
        return "=====================\n"
                + "Nome    :"+this.nome +
                "\nTelefone:"+ this.telefone+
                "\nEmail   :"+ this.email+
                "\n=====================\n";
    }
    
}
