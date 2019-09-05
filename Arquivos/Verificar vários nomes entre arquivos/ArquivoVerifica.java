import java.io.*;
import java.util.Scanner;

public class ArquivoVerifica {

    public static void main(String[] args) throws IOException {

        final String caminho = "nomesCopia.txt";

        Scanner in = new Scanner(System.in);
        String nome = "";

        while (!nome.equalsIgnoreCase("sair")) {
            boolean encontrado = false;
            System.out.println("Digite o nome a ser pesquisado:");
            nome = in.nextLine();
            FileReader reader = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(reader);
            String line = null;
            while ((line = leitor.readLine()) != null) {
                if (line.equalsIgnoreCase(nome)) {
                    System.out.println("Nome já cadastrado");
                    encontrado = true;
                    break;
                }
            }
            leitor.close();
            reader.close();
            if (!encontrado) {
                File arquivo = new File(caminho);
                FileWriter printer = new FileWriter(arquivo, true);
                PrintWriter pw = new PrintWriter(printer);
                pw.println(nome);
                pw.close();
            }
        }
    }
}
