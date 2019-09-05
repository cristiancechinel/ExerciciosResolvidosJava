
import java.util.Scanner;

public class VetorNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[10];

        System.out.println("Digite 10 notas: ");
        for (int x = 0; x < notas.length; x++)
            notas[x] = entrada.nextFloat();

        System.out.println("\nNotas acima de 5.0: ");
        for (int x = 0; x < notas.length; x++)
            if (notas[x] > 5)
                System.out.println(notas[x]);

    }
}

