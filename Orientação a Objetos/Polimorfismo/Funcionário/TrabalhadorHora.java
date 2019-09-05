
public class TrabalhadorHora extends Funcionario{
    private double horas;
    private double valorPorHora;

    TrabalhadorHora(){
    	
    }
    
    TrabalhadorHora(String nome, String sobrenome, double horas, double valorPorHora){
    	super(nome,sobrenome);
    	this.setHoras(horas);
    	this.setValorPorHora(valorPorHora);
    }
    
    @Override
    public double salario() {
       return valorPorHora * horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    @Override
    public String toString() {
		return super.toString() + ", horas = " + this.horas + " , valorPorHora = " + this.valorPorHora;
    }
}
