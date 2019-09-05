

import java.util.Scanner;

public class VetoresNomesIdadesSexosContagem {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int length = 10;
		int[] idades = new int[length];
		String[] nomes = new String[length], sexos = new String[length];
		int sexoM = 0, sexoF = 0;

		for (int x = 0; x < idades.length; x++) {
			System.out.println("Digite o nome da pessoa " + x + ":");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite a idade da pessoa " + x + ":");
			idades[x] = teclado.nextInt();
			System.out.println("Digite o sexo da pessoa " + x + ":");
			sexos[x] = teclado.next();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt

		}

		for (int x = 0; x < idades.length; x++) {
			if (idades[x] > 18 && sexos[x].equalsIgnoreCase("f")) {
				sexoF++;
			}
			else if (idades[x] > 18 && sexos[x].equalsIgnoreCase("m")) {
				sexoM++;
			}
		}

		System.out.println("Quantidade de mulheres com idade maior que 18: " + sexoF);
		System.out.println("Quantidade de homens com idade maior que 18: " + sexoM);
	}

}

