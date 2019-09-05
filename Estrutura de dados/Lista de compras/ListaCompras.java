import java.util.*;

public class ListaCompras {
    
    public static void main(String[] args){
        
        ArrayList<String> lista = new ArrayList<>();
        int opcao;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("digite opcao");
            System.out.println("1 - cadastrar comida");
            System.out.println("2 - imprimir lista");
            System.out.println("3 - remover comida");
            System.out.println("4 - sair");
            opcao = Integer.parseInt(entrada.nextLine());
            
            switch (opcao){
                case 1: System.out.println("digite comida");
                        String comida = entrada.nextLine();
                        lista.add(0, comida);
                        break;
                    
                case 2: System.out.println("Lista de compras");
                        for (String s: lista) 
                            System.out.println(s);
                        break;
                    
                case 3: System.out.println("remover");
                        if (!lista.isEmpty()) 
                            lista.remove(0);
                        break;
                    
                case 4: System.out.println("sair");
                        break;
                    
                default: System.out.println("opcao invalida");
            }
        } while (opcao!=4);
    }
}
