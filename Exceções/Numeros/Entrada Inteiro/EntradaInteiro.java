import java.io.*;

public class EntradaInteiro {
    
    public static void main(String[] args){
        int v1 = obtemNumero();
        int v2 = obtemNumero();
        
        System.out.println("v1 "+ v1);
        System.out.println("v2 "+ v2);
    }
    
    static int obtemNumero() {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite um numero");
        int x;
        try {
            x = Integer.parseInt(bw.readLine());
            return x; 
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
