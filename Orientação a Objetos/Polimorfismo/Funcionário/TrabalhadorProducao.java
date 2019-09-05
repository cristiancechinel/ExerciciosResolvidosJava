
public class TrabalhadorProducao extends Funcionario {
    private int quantidade;
    private double valorPorPeca;
  
    TrabalhadorProducao(){
    	
    }
    
    TrabalhadorProducao(String nome, String sobrenome, int quantidade, double valorPorPeca){
    	super(nome,sobrenome);
    	this.setQuantidade(quantidade);
    	this.setValorPorPeca(valorPorPeca);
    }
    @Override
    public double salario() {
        return quantidade*valorPorPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public void setValorPorPeca(double valorPorPeca) {
        this.valorPorPeca = valorPorPeca;
    }
    
    @Override
    public String toString() {
		return super.toString() + ", quantidade = " + this.quantidade + " , valorPorPeca = " + this.valorPorPeca;
    }
}
