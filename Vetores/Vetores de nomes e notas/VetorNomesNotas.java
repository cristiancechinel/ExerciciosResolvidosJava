
import java.util.Scanner;

public class VetorNomesNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float[] notas = new float[5];
        String[] nomes = new String[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Digite o nome do aluno " + x + ":");
            nomes[x] = teclado.nextLine();

            System.out.println("Digite a nota do aluno " + x + ":");
            notas[x] = teclado.nextFloat();

            teclado.nextLine(); // Consome o resto da linha deixado pelo nextFloat()
        }

        System.out.println("\nNome dos alunos que tiraram nota maior que 5.0: \n");
        for (int x = 0; x < notas.length; x++)
            if (notas[x] > 5)
                System.out.println(nomes[x]);

    }

}
