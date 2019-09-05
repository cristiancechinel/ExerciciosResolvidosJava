import java.util.Scanner;

public class FuncoesMatematicas {

    public static void printFibonacci(int limite) {
        int anterior = 0;
        int atual = 1;
        System.out.print(anterior + " " + atual);

        for (int i = 0; i < limite - 2; i++) {
            int sucessor = anterior + atual;
            System.out.print(" " + sucessor);
            anterior = atual;
            atual = sucessor;
        }

        System.out.println();
    }

    public static float calculaQuadrado(float n) {
        return n * n;
    }

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static double converteTempParaCelsius(int n){
        return ((n - 32) / 1.8);
    }

    public static double converteTempParaFahrenheit(int n) {
        return ((1.8 * n) + 32);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // testa metodo printFibonacci()
        System.out.println("Sequencia de Fibonacci de 10 numeros");
        printFibonacci(10);

        // testa metodo calculaQuadrado()
        System.out.println("\nDigite um numero para calculo do quadrado:");
        float x1 = entrada.nextFloat();
        float result1 = calculaQuadrado(x1);
        System.out.println("Quadrado: " + result1);

        // testa metodo fatorial()
        System.out.println("\nDigite um numero inteiro positivo para calculo de fatorial:");
        int x = entrada.nextInt();
        entrada.close();
        int result = fatorial(x);
        System.out.println("Fatorial: " + result);

        // testa metodo converteTempParaCelsius()
        double result2 = converteTempParaCelsius(50);
        System.out.println("\n50 graus Fahrenheit equivalente a " + result2 + " graus Celsius");

        // testa metodo converteTempParaCelsius()
        double result3 = converteTempParaFahrenheit(32);
        System.out.println("32 graus Celsius equivalente a " + result3 + " graus Fahrenheit");

    }
}

