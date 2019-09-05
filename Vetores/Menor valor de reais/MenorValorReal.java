import java.util.Scanner;

public class MenorValorReal {

    public static double menor(double vetor[]) {
        if(vetor.length < 1)
            return (Double) null;
        double menorValor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }

    public static void main(String[] args) {

        double[] vetorReais = new double[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 valores reais:");
        for (int i = 0; i < vetorReais.length; i++)
            vetorReais[i] = entrada.nextDouble();
        entrada.close();

        double menor = menor(vetorReais);
        System.out.println("Menor = " + menor);

	}
    
}
