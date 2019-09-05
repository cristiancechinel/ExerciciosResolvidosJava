import java.util.*;
public class InteiroLoop {
    
    public static void main(String[] args){
        
        boolean outravez = true;
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        while (outravez == true) {
            System.out.println("Digite um numero inteiro");
            try {
                numero = Integer.parseInt(entrada.nextLine());
                outravez = false;
            }
            catch (NumberFormatException e){
                System.out.println(e);
            }
        }
    }
}
