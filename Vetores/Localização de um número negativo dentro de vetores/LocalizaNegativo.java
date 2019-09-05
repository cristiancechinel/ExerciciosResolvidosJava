import java.util.Scanner;

public class LocalizaNegativo {

    public static void main(String[] args) {

        //deficicao e instanciacao de variaveis
        Scanner teclado = new Scanner(System.in);
        int length = 10;
        int[] vetor = new int[length];

        //Le conjunto de inteiros
        System.out.println("Digite 10 numeros");
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = teclado.nextInt();
        }

        //Encontra negativo e mostra o index do menor, se houver
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println("\nIndex da menor posicao: " + i + "\nNumero: " + vetor[i]);
                break;
            }

        }
    }
}
