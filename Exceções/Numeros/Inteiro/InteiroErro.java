import java.util.Scanner;
public class InteiroErro {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int x = entrada.nextInt();
        System.out.println("Informe o segundo valor");
        int y = entrada.nextInt();
        int r = x/y;
        System.out.println("resultado = "+ r);
    }
}
