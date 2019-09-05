import java.util.*;
public class PositivoTryCatch {
    public static void main(String[] args){
        
        System.out.println("digite um numero positivo");
        Scanner entrada = new Scanner(System.in);
        try {
            int x = entrada.nextInt();
            if (x < 0) throw new ArithmeticException("valor negativo");
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}