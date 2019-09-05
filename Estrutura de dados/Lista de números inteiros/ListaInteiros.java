import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInteiros {
	public static List<Integer> numeros = new ArrayList();
    public static final Scanner in = new Scanner(System.in);

    
    public static void main(String args[]) {
        int opcao;
        int loop = 1;
        while (loop == 1) {
        	System.out.println("-------------------------------");
        	System.out.println("Digite o numero da opcao que deseja realizar:\n 1. sair \n 2. cadastrar \n 3. listar");
        	opcao = in.nextInt();
        	switch(opcao) {
	        	case 1:
	        		loop = 0;
	        		break;
	        	case 2:
	        		System.out.print("Digite o numero a ser inserido: ");
	                int num = in.nextInt();
	                if(numeros.contains(num)) {
	                    System.out.println("Numero ja existe na lista");
	                }else {
	                	numeros.add(num);
	                }
	        		break;
	        	case 3:
	        		if (numeros.isEmpty()) {
	        			System.out.println("Lista vazia");
	            	}else {
		        		for(int i : numeros){
	                        System.out.print(i + "\n");
	                    }
	            	}
	        		break;
	        	default:
	        		System.out.println("Opcao invalida.");
	        		break;
        	}
        }
    }
}