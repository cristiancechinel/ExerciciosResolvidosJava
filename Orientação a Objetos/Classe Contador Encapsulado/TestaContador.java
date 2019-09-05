
import java.util.Random;

public class TestaContador {
    public static void main(String[] args) {
        Random r = new Random();
        Contador contaPar = new Contador("Pares"), contaImpar = new Contador("Impares");

        for (int i = 0; i < 100; i++) {
            if(r.nextInt() % 2 == 0){
                contaPar.incrementa();
            }else{
                contaImpar.incrementa();
            }
        }

        System.out.println(contaPar.getId() + ": " + contaPar.getContagem());
        System.out.println(contaImpar.getId() + ": " + contaImpar.getContagem());

        if (contaPar.getContagem() == contaImpar.getContagem()){
            System.out.println("Contagens empataram!");
        }else if (contaPar.getContagem() > contaImpar.getContagem()){
            System.out.println("Par venceu!");
        }else{
            System.out.println("Impar venceu!");
        }
    }
}
