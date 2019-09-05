
public class TestaPontoCirculo {

	public static void main(String[] args) {
		Circulo c = new Circulo(10, 2, 3);

		Circulo c2 = new Circulo();
		System.out.println(c2);
		System.out.println(c);

		Ponto p = new Ponto(4, 5);

		System.out.println(p.x + " " + p.y);

	}
}
