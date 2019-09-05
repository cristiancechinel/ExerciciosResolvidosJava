

import java.util.Scanner;

public class VetoresInteirosSomas {

    public static void main(String[] args) {

        //definicao de variaveis
        Scanner teclado = new Scanner(System.in);
        int length = 5;
        int[] v1 = new int[length], v2 = new int[length], soma = new int[length];

        //leitura do vetor 1
        System.out.println("Digite os valores do vetor 1: ");
        for (int x = 0; x < v1.length; x++) {
            v1[x] = teclado.nextInt();
        }

        //leitura do vetor 2
        System.out.println("\nDigite os valores do vetor 2: ");
        for (int x = 0; x < v2.length; x++) {
            v2[x] = teclado.nextInt();
        }

        teclado.close();

        //soma dos vetores 1 e 2 e impressao
        System.out.println("\nVetor soma: ");
        for (int x = 0; x < v1.length; x++) {
            soma[x] = v1[x] + v2[x];
            System.out.println(soma[x]);

        }

    }
}

