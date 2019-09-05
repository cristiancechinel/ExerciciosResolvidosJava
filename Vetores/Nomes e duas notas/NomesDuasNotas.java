import java.util.Scanner;

public class NomesDuasNotas {

    public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];
        float[] notas = new float[20];

		for (int x = 0; x < 10; x++) {
            System.out.println("Digite o nome do aluno:");
            nomes[x] = entrada.nextLine();
            
            System.out.println("Digite a nota 1 do aluno: ");
            notas[2*x] = entrada.nextFloat();
            
            System.out.println("Digite a nota 2 do aluno: ");
            notas[2*x + 1] = entrada.nextFloat();
            
            entrada.nextLine();
        }
        
        for (int x = 0; x < 10; x++) {    
            float media = (notas[2*x] + notas[2*x + 1]) / 2;
            System.out.println("\nNome do aluno: " + nomes[x] + "\nNota 1: " + notas[2*x] + " - Nota 2: " + notas[2*x + 1] + "\nMédia: " + media);
        }
    }
}