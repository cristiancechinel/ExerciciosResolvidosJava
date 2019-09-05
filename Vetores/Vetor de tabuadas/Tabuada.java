

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int[] tab = new int[11];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para tabuada:");
        int n = entrada.nextInt();
        entrada.close();

        for (int i = 0; i <= 10; i++) {
            tab[i] = i * n;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}

