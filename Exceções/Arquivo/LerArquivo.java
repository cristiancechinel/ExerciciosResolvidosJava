import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
      String caminho = "teste.txt";
      String linha = null;
      try{
         FileReader fr = new FileReader(caminho);
         BufferedReader br = new BufferedReader(fr);
         while((linha = br.readLine()) != null){
            System.out.println(linha);
         }
         br.close();
      }
      catch(IOException e){
         System.out.println("Erro arquivo " + caminho + " nao encontrado!");
      }
     
   }
}
