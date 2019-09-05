import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int n1, n2, opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 2 numeros inteiros:");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        System.out.println("Digite a operacao desejada: \n1 - soma \n2 - subtracao \n3 - divisao \n4 - multiplicacao");
        opcao = entrada.nextInt();
        entrada.close();

        switch (opcao) {
            case 1:
            	System.out.println("Soma: " + (n1 + n2));
            	break;
            case 2:
            	System.out.println("Subtracao: " + (n1 - n2));
            	break;
            case 3:
            	System.out.println("Divisao: " + (n1 / n2));
            	break;
            case 4:
            	System.out.println("Multiplicacao: " + (n1 * n2));
            	break;
            default:
            	System.out.println("Operacao invalida!");
            	break;
        }
    }
}