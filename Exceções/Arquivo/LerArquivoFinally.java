import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoFinally {
    public static void main(String[] args) throws IOException {
      String caminho = "nomes1.txt";
      String linha = null;
      FileReader fr = null;
      BufferedReader br = null;
      try{
         fr = new FileReader(caminho);
         br = new BufferedReader(fr);
         while((linha = br.readLine()) != null){
            System.out.println(linha);
         }
      }
      catch(FileNotFoundException e){
         System.out.println("Erro arquivo " + caminho + " nao encontrado!");
      }
      catch(IOException e){
          System.out.println(e);
      }
      finally {
            if (br != null) br.close();
            if (fr != null) fr.close();
            System.out.println("fechou br");
            System.out.println("fechou fr");
            
      } 
    }
}

