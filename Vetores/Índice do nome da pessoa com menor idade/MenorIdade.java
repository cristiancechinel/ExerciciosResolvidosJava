

import java.util.Scanner;

public class MenorIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] idades = new int[10];
		String[] nomes = new String[10];
		int menor, index = 0;

		for (int x = 0; x < idades.length; x++) {
			System.out.println("Digite o nome da pessoa " + x + ":");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite a idade da pessoa " + x + ":");
			idades[x] = teclado.nextInt();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt
		}

		menor = idades[0];
		for (int x = 0; x < idades.length; x++) {
			if (menor > idades[x]) {
				menor = idades[x];
				index = x;
			}
		}

		System.out.println("Nome da Pessoa com menor idade: " + nomes[index]);
	}

}

