
public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    public abstract double salario();
    
    Funcionario(){

    }
    
    Funcionario(String nome, String sobrenome){
    	this.setNome(nome);
    	this.setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "nome = " + nome + ", sobrenome = " + sobrenome;
    }
}
