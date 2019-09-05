

import java.util.Scanner;

public class VetoresNomesIdadesSexosContagem {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int length = 10;
		int[] idades = new int[length];
		String[] nomes = new String[length], sexos = new String[length];
		int menor, index = 0;

		for (int x = 0; x < idades.length; x++) {
			System.out.println("Digite o nome da pessoa " + x + ":");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite a idade da pessoa " + x + ":");
			idades[x] = teclado.nextInt();
			System.out.println("Digite o sexo da pessoa " + x + ":");
			sexos[x] = teclado.next();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt

		}

		menor = idades[0];
		for (int x = 0; x < idades.length; x++) {
			if (menor > idades[x]) {
				menor = idades[x];
				index = x;
			}
		}

		System.out.println("Pessoa com a menor idade: \nNome: " + nomes[index] + "\nSexo: " + sexos[index]);

	}

}

