

public class InverterVetor {

	public static void main(String[] args) {
		// inicializacao de variaveis e chamada do metodo inverteVetor
		int[] vetorTeste = { 1, 2, 3, 4, 5 };
		int[] vetorInvertido = inverteVetor(vetorTeste);

		// teste do novo vetor
		System.out.println("Vetor invertido:");
		for (int item : vetorInvertido)
			System.out.println(item);

	}

	// funcao para inverter vetor de inteiros
	public static int[] inverteVetor(int[] vetor) {
		int[] vetorInvertido = new int[vetor.length];
		int aux = 0;

		for (int x = (vetor.length - 1); x >= 0; x--) {
			vetorInvertido[aux] = vetor[x];
			aux++;
		}

		return vetorInvertido;

	}

}

