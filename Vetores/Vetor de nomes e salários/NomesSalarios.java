import java.util.Scanner;

public class NomesSalarios {

	public static void main(String[] args) {
		// declaracao de variaveis
		Scanner teclado = new Scanner(System.in);
		int length = 5;
		String[] nomes = new String[length];
		double[] salarios = new double[length];

		// iteracao e leitura dos dados
		for (int x = 0; x < length; x++) {
			System.out.println("Digite o nome do funcionario: ");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite o salario do funcionario: ");
			salarios[x] = teclado.nextFloat();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt

		}

		teclado.close();

		// calcula e mostra os novos salarios e nomes
		for (int x = 0; x < salarios.length; x++) {
			salarios[x] = salarios[x] + (salarios[x] * 0.08);
			System.out.println("\nNome do funcionario: " + nomes[x] + "\nNovo Salario: " + salarios[x]);
		}

	}

}