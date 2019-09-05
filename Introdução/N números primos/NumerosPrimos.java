import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        int n;
        boolean primo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        n = entrada.nextInt();
        entrada.close();

        for (int i = 2; i <= n; i++) {
            primo = true;
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo)
                System.out.println("Numero primo: " + i);
        }
    }
}

