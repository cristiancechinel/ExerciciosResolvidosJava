public class Data {
	private int dia;
	private int mes;
	private int ano;

	
	void setData(int d, int m, int a) {
		this.setDia(d);
		this.setMes(m);
		this.setAno(a);
	}

	public int getDia() {
		return dia;
	}

	private void setDia(int dia) {
		if (dia >= 1 && dia <= 31)
			this.dia = dia;
		else
			dia = 1;
	}

	public int getMes() {
		return mes;
	}

	private void setMes(int mes) {
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
		else
			this.mes = 1;
	}

	public int getAno() {
		return ano;
	}

	private void setAno(int ano) {
		if (ano >= 1900 && ano <= 2018)
			this.ano = ano;
		else
			this.ano = 2018;
	}
	
	public String getData() {
		return  this.dia +"/"+ this.mes +"/"+this.ano; 
	}
}

