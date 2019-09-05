import java.util.InputMismatchException;
import java.util.Scanner;

public class Inteiro {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        try{
            int x = entrada.nextInt();
            System.out.println("Informe o segundo valor");
            int y = entrada.nextInt();
            int r = x/y;
            System.out.println("resultado = "+ r);
        }
        catch (InputMismatchException e){
            System.out.println("valor digitado deve ser inteiro "+ e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("divisao por zero "+ e);
        }
    }
}
