import java.util.Scanner;

public class MediaTurma {

	public static void main(String[] args) {

		// declaracao de variaveis
		Scanner teclado = new Scanner(System.in);
		int length = 80; //mudar para valor menor ao testar
		float soma = 0, media = 0;
		int[] notas = new int[length];

		// iteracao
		for(int x = 0; x < notas.length; x++) {
			System.out.println("Digite uma nota: ");
			notas[x] = teclado.nextInt();
			soma += notas[x];
		}

		teclado.close();

		//exibe as notas
		System.out.println("\nNotas dos alunos: ");
		for(int nota: notas)
			System.out.println(nota);

		// calculo da media
		media = soma / notas.length;
		System.out.println("\nMedia das notas da turma: " + media);

	}

}

