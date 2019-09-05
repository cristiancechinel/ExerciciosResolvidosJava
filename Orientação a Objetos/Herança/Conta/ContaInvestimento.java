
public class ContaInvestimento extends Conta{

	public ContaInvestimento(String t, String c, String a, double s){
		super(t,c,a,s);
	}
	public void atualizar(){
		this.saldo = this.saldo*1.01;
	}
}
