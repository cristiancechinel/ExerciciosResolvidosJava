import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        System.out.println("Digite 15 numeros inteiros: ");
        for (int x = 0; x < vetorA.length; x++)
            vetorA[x] = teclado.nextInt();

        System.out.println("\nVetor B: ");
        for (int x = 0; x < vetorB.length; x++) {
            vetorB[x] = vetorA[x] * 3;
            System.out.println(vetorB[x]);

        }
    }
}