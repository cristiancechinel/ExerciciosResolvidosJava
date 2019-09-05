import java.util.Scanner;

public class VetoresNomesIdadesSexos {

	public static void main(String[] args) {
		// instanciacao de variaveis
		Scanner teclado = new Scanner(System.in);
		int length = 10;
		int[] idades = new int[length];
		String[] nomes = new String[length],
				sexos = new String[length];

		// leitura dos dado
		for (int x = 0; x < idades.length; x++) {
			System.out.println("Digite o nome da pessoa " + x + ":");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite a idade da pessoa " + x + ":");
			idades[x] = teclado.nextInt();
			System.out.println("Digite o sexo da pessoa (m/f) " + x + ":");
			sexos[x] = teclado.next();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt

		}

		teclado.close();

		// média de idade das pessoas
		System.out.println(
				"\nMedia de idades: " + calculaMedia(idades));

		// b) nome da pessoa mais jovem
		System.out.println("\nNome da pessoa mais jovem: " + encontraNomeMaisJovem(idades, nomes));

		// c) nome da pessoa mais idosa
		System.out.println("\nNome da pessoa mais idosa: " + encontraNomeMaisVelho(idades, nomes));

		// d) nome e a idade do homem mais jovem
		int indexMaisJovem = indexHomemMaisJovem(idades, sexos);
		if (indexMaisJovem != -1) {
			System.out.println("\nHomem mais jovem: " + nomes[indexMaisJovem] + "\nIdade: " + idades[indexMaisJovem]);
		} else {
			System.out.println("\nNao ha homens!");
		}

		// e) nome e idade da mulher mais idosa
		int indexMaisIdosa = indexMulherMaisIdosa(idades, sexos);
		if (indexMaisIdosa != -1) {
			System.out.println(
					"\nMulher mais Idosa: " + nomes[indexMaisIdosa] + "\nIdade: " + idades[indexMaisIdosa]);
		} else {
			System.out.println("\nNao ha mulheres!");
		}

	}

	public static double calculaMedia(int[] idades) {
		double soma = 0, media = 0;
		for (int idade : idades)
			soma += idade;
		media = soma / idades.length;
		return media;

	}

	public static String encontraNomeMaisJovem(int[] idades, String[] nomes) {
		int menor = idades[0], indexMaisJovem = 0;
		for (int x = 1; x < idades.length; x++) {
			if (idades[x] < menor) {
				menor = idades[x];
				indexMaisJovem = x;
			}
		}

		return nomes[indexMaisJovem];
	}

	public static String encontraNomeMaisVelho(int[] idades, String[] nomes) {
		int maior = idades[0], indexMaisVelho = 0;
		for (int x = 1; x < idades.length; x++) {
			if (idades[x] > maior) {
				maior = idades[x];
				indexMaisVelho = x;
			}
		}

		return nomes[indexMaisVelho];
	}

	public static int indexHomemMaisJovem(int[] idades, String[] sexos) {
		int menor = Integer.MAX_VALUE, indexMaisJovem = -1;
		for (int x = 0; x < idades.length; x++) {
			if (menor > idades[x] && sexos[x].equalsIgnoreCase("m")) {
				menor = idades[x];
				indexMaisJovem = x;
			}
		}

		return indexMaisJovem;
	}

	public static int indexMulherMaisIdosa(int[] idades, String[] sexos) {
		int maior = Integer.MIN_VALUE, indexMaisIdosa = -1;
		for (int x = 0; x < idades.length; x++) {
			if (maior < idades[x] && sexos[x].equalsIgnoreCase("f")) {
				maior = idades[x];
				indexMaisIdosa = x;
			}
		}

		return indexMaisIdosa;
	}

}

