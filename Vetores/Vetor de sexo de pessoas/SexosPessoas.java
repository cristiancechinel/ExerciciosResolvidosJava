

import java.util.Scanner;

public class SexosPessoas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] sexos = new String[30];
        int contM = 0;
        int contF = 0;

        System.out.println("Digite o sexo da pessoa: \n- F para feminino \n- M para masculino");

        for (int x = 0; x < sexos.length; x++) {
            sexos[x] = teclado.next();

            if (sexos[x].equalsIgnoreCase("f"))
                contF++;
            else if (sexos[x].equalsIgnoreCase("m"))
                contM++;
        }

        System.out.println("Quantidade de pessoas do sexo feminino: " + contF);
        System.out.println("Quantidade de pessoas do sexo masculino: " + contM);

    }
}
