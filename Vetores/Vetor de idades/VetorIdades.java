
import java.util.Scanner;

public class VetorIdades {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[10];

        System.out.println("Digite 10 idades: ");
        for (int x = 0; x < idades.length; x++)
            idades[x] = teclado.nextInt();

    }
}
