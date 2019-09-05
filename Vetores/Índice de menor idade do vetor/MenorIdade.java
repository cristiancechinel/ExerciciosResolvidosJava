
import java.util.Scanner;

public class MenorIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[10];
        int idadeMenor;

        System.out.println("Digite 10 idades: ");
        for (int x = 0; x < idades.length; x++)
            idades[x] = teclado.nextInt();

        idadeMenor = idades[0];
        for (int x = 0; x < idades.length; x++){
            if (idades[x] < idadeMenor)
                idadeMenor = x;
        }
        System.out.println("Posicao da menor idade digitada: " + idadeMenor);

    }
}
