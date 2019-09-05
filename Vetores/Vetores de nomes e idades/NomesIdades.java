
import java.util.Scanner;

public class NomesIdades {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[10];
        String[] nomes = new String[10];

        for (int x = 0; x < 10; x++) {
            System.out.println("Digite o nome da pessoa " + x + ":");
            nomes[x] = teclado.nextLine();
            System.out.println("Digite a idade do aluno " + x + ":");
            idades[x] = teclado.nextInt();
            teclado.nextLine(); // Consome o resto da linha deixado pelo nextInt
        }
    }
}
