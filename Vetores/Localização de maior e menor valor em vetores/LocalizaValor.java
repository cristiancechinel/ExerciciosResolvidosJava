import java.util.Scanner;

public class LocalizaValor {

    public static void main(String[] args) {

        //deficicao e instanciacao de variaveis
        Scanner teclado = new Scanner(System.in);
        int length = 10;
        int[] vetor = new int[length];
        int maior, menor, diferenca;

        //Le conjunto de inteiros
        System.out.println("Digite 10 numeros");
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = teclado.nextInt();
        }

        //calcula menor e maior numero do array
        menor = vetor[0];
        maior = vetor[0];
        for (int x = 1; x < vetor.length; x++) {
            if(menor > vetor[x])
                menor = vetor[x];
            if(maior < vetor[x])
                maior = vetor[x];
        }

        //calcula a diferenca entre o maior e menor
        diferenca = maior - menor;
        System.out.println("Maior: " + maior + "\nMenor: " + menor + "\nDiferenca entre o maior valor e o menor: " + diferenca);
    }
}

