import java.io.*;
import java.util.Scanner;

public class ArquivoNome {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String caminho = "nomes.txt";
        File arquivo = new File(caminho);
        FileWriter printer = new FileWriter(arquivo, true);
        PrintWriter pw = new PrintWriter(printer);
        String nome;
        boolean continua;
        continua = true;
        do {
            System.out.println("Digite um nome ou digite sair para finalizar: ");
            nome = in.nextLine();
            if (nome.equalsIgnoreCase("SAIR")) {
                continua = false;
            } else {
                pw.println(nome);
            }
        } while (continua);
        pw.close();
        System.out.println("Lendo o arquivo: ");
        FileReader reader = new FileReader(caminho);
        BufferedReader leitor = new BufferedReader(reader);
        String line = null;
        while((line = leitor.readLine()) != null){
            System.out.println(line);
        }
    }
}

