import java.util.Scanner;

public class MediaTurma {

	public static void main(String[] args) {

		// declaracao de variaveis
		Scanner teclado = new Scanner(System.in);
		int length = 80, index = 0; //mudar length para algo menor ao testar
		float soma = 0, media = 0;
		int[] notas = new int[length];

		// iteracao
		while (index < notas.length) {
			System.out.println("Digite uma nota: ");
			notas[index] = teclado.nextInt();
			soma += notas[index];
			index++;
		}

		teclado.close();

		//exibe as notas
		System.out.println("Notas dos alunos: ");
		for(int nota: notas)
			System.out.println(nota);

		// calculo da media
		media = soma / notas.length;
		System.out.println("\nMedia das notas da turma: " + media);



	}

}

