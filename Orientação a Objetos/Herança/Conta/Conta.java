
public class Conta{
	protected String titular;
	protected String nConta;
	protected String nAgencia;
	protected double saldo;
	protected String status;

	public Conta(String t, String c, String a, double s){
		this.titular = t;
		this.nConta = c;
		this.nAgencia = a;
		deposito(s);
	}
	public void saque(double valor){
		this.saldo-=valor;
		alteraStatus();
	}

	public void alteraStatus(){
			if(this.saldo<0){
			this.status = "negativo";
		}else{
			this.status = "positivo";
		}
	}

	public void deposito(double s){
		this.saldo+=s;
		alteraStatus();
	}
	public void transferePara(Conta destino, double valor){
		destino.deposito(valor);
		saque(valor);
	}
	public void atualizar(){
		this.saldo= this.saldo * 1;
	}

	public String toString(){
		return "Titular: "+this.titular+"\nConta: "+nConta+"\nAgencia: "+nAgencia+"\nSaldo: "+saldo+" | "+status;
	}

}
