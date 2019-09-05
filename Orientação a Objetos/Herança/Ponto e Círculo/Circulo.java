
public class Circulo extends Ponto {
	protected double raio;

	Circulo() {
		// aqui existe uma chamada implicita ao construtor de Ponto
		setRaio(0);
	}

	Circulo(double raio, float x, float y) {
		super(x, y);// chamando o construtor em Ponto
		this.raio = raio;
	}

	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		if (raio > 0)
			this.raio = raio;
		else
			this.raio = 0;
	}

	public double area() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public String toString() {
		// return "Raio = "+this.raio+ " x:"+this.x + " y: "+this.y;
		return super.toString() + " Raio = " + this.raio;
	}
}
