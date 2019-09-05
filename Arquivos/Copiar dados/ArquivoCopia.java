import java.io.*;

public class ArquivoCopia {

    public static void main(String[] args) throws IOException {

        final String caminho = "nomes.txt";
        final String copia = "nomesCopia.txt";
        File arquivo = new File(copia);
        FileWriter printer = new FileWriter(arquivo, true);
        PrintWriter pw = new PrintWriter(printer);

        FileReader reader = new FileReader(caminho);
        BufferedReader leitor = new BufferedReader(reader);
        String line = null;
        while((line = leitor.readLine()) != null){
            pw.println(line);
        }
        pw.close();

    }
}
