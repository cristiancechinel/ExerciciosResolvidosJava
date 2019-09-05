import java.util.*;
public class Positivo {
    public static void main(String[] args){
        
        System.out.println("digite um numero positivo");
        Scanner entrada = new Scanner(System.in);
        
        int x = entrada.nextInt();
        if (x < 0) {
            throw new ArithmeticException("valor negativo");
        }
    
    }
}
