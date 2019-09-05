
import java.util.Scanner;

public class VetoresNomesIdadesSexosLeituraEscrita {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] idades = new int[10];
		String[] nomes = new String[10], sexos = new String[10];

		for (int x = 0; x < idades.length; x++) {
			System.out.println("Digite o nome da pessoa " + x + ":");
			nomes[x] = teclado.nextLine();
			System.out.println("Digite a idade da pessoa " + x + ":");
			idades[x] = teclado.nextInt();
			System.out.println("Digite o sexo da pessoa " + x + ":");
			sexos[x] = teclado.next();
			teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt

		}
	}

}
