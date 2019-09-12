
public class Tempo{
    private	int ano;
    private	int mes;
    private	int dia;

	public Tempo(int d, int m, int a){
		setDia(d);
		setMes(m);
		setAno(a);
	}
	public void setDia(int d){
		if((d>0) && (d<=31)){
			this.dia = d;
		}else{
			System.out.println("Dia Invalido");
		}
	}
	public void setMes(int m){
		if((m>0) && (m<=12)){
			this.mes = m;
		}else{
			System.out.println("Mes invalido");
		}
	}
	public void setAno(int a){
		if((a>0) && (a<2019)){
			this.ano = a;
		}else{
			System.out.println("Ano invalido");
		}
	}
	public String toString() {
        return  dia + " / " + mes + " / " + ano;
    }
}
