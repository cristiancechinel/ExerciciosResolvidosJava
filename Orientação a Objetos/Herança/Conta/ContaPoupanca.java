
public class ContaPoupanca extends Conta{

	public ContaPoupanca(String t, String c, String a, double s){
		super(t,c,a,s);
	}
	public void atualizar(){
		this.saldo= this.saldo * 1.005;
	}
}
