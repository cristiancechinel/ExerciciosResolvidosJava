import java.util.Scanner;

public class TestaContaBancaria {
    
    public static void main(String[] args){
        
        ContaBancaria contaA = new ContaBancaria(500);
        contaA.depositaValor(1000);
        System.out.println("A");
        contaA.consultaSaldo();
        
        ContaBancaria contaB = new ContaBancaria(0);
        System.out.println("B");
        contaB.consultaSaldo();
        
        contaA.transferencia(1300, contaB);

        System.out.println("A");
        contaA.consultaSaldo();
      
        System.out.println("B");
        contaB.consultaSaldo();
       
    }
    
}
