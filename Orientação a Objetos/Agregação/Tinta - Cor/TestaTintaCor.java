
public class TestaTintaCor {
    public static void main(String args[]){
        Cor cor = new Cor(255,255,255); //branco
        Tinta tinta = new Tinta("Tinta branca",20,false,cor);
        System.out.println(tinta.toString());
    }
}

