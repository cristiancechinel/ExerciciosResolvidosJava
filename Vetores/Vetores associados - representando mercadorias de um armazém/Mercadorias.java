
import java.util.Scanner;

public class Mercadorias {

    public static void main(String[] args) {

        //deficicao e instanciacao de variaveis
        Scanner teclado = new Scanner(System.in);
        int length = 100; //mudar para um valor menor ao testar
        int[] qtdeVendaMercadoria = new int[length];
        float[] precoVendaMercadoria = new float[length];

        float faturamento = 0f;

        //inseri a quantidade de produtos vendidos e preco de venda
        for (int x = 0; x < length; x++) {
            System.out.println("Quantidade vendida do produto " + x + ":");
            qtdeVendaMercadoria[x] = teclado.nextInt();
            System.out.println("Preco de venda do produto " + x + ":");
            precoVendaMercadoria[x] = teclado.nextFloat();

        }

        //calcula o faturamento
        for (int x = 0; x < length; x++) {
            faturamento += (precoVendaMercadoria[x] * qtdeVendaMercadoria[x]);
        }

        System.out.println("\nFaturamento: " + faturamento);
    }
}

