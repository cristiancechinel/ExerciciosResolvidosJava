import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {

        float n1, n2, n3, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 notas:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        entrada.close();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Media = " + media);

        if (media >= 6)
            System.out.println("Aluno aprovado!");
        else if (media < 6 && media >= 3)
            System.out.println("Aluno em recuperacao!");
        else
            System.out.println("Aluno reprovado!");

	}
}