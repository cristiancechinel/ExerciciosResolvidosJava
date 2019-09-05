

public class Piramide {

	public static void main(String[] args) {
		// chamada da funcao no metodo principal
		imprimePiramide(10);

	}

	// funcao para imprimir piramide
	public static void imprimePiramide(int tamanho) {
		String[] piramide = new String[tamanho];
		String asterisco = "*";

		for (int x = 0; x < piramide.length; x++) {
			piramide[x] = asterisco;
			System.out.println(piramide[x]);
			asterisco = asterisco.concat("*");
		}

	}

}

