import java.util.Scanner;

public class LocalizaPosicao {

    public static void main(String[] args) {

        //deficicao e instanciacao de variaveis
        Scanner teclado = new Scanner(System.in);
        int length = 10;
        int[] vetor = new int[length];
        int maior, menor, diferenca, indexMenor = 0, indexMaior = 0;

        //Le conjunto de inteiros
        System.out.println("Digite 10 numeros");
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = teclado.nextInt();
        }

        //encontra o menor, maior e os indices desses valores no array
        menor = vetor[0];
        maior = vetor[0];
        for (int x = 1; x < vetor.length; x++) {
            if (menor > vetor[x]) {
                menor = vetor[x];
                indexMenor = x;
            }
            if (maior < vetor[x]) {
                maior = vetor[x];
                indexMaior = x;

            }
        }

        //calcula a diferenca entre o index do maior e menor
        diferenca = Math.abs(indexMaior - indexMenor);
        System.out.println("Posicao Maior: " + indexMaior + "\nPosicao Menor: " + indexMenor + "\nDiferenca entre a posicao do maior valor e a posicao do menor: " + diferenca);

    }
}

