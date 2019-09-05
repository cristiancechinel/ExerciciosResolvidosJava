import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {

    public static List<String> nomes = new ArrayList();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        nomes.add("Maria da Silva");
        nomes.add("Joao de Souza");
        nomes.add("James Bond");
        nomes.add("Tony Stark");
        nomes.add("Jack Sparrow");
        int opcao;
        while (nomes.size() > 0) {
        	System.out.println("-------------------------------");
        	System.out.println("Qual dos nomes abaixo voce gostaria de excluir da lista?");
        	for (int i = 0; i < nomes.size(); i++) {
        		System.out.println((i + 1) + ". " + nomes.get(i));
        	}
        	System.out.println("-------------------------------");
        	opcao = in.nextInt();
        	if (opcao < 1 || opcao > nomes.size()) {
        		System.out.println("Opcao invalida");
        	} else {
        		nomes.remove(opcao-1);
        		 
            	if (nomes.isEmpty()) {
            		System.out.println("Lista vazia");
            	}else {
            		System.out.println("Nomes restantes: ");
            		for(String nome : nomes){
            			System.out.println(nome);
            		}
            	}
        	}
        }
    }
}

