
public class TestaContador {
    public static void main(String[] args) {
        Contador c1 = new Contador("pessoas",1,10);
        c1.incrementa();
        c1.incrementaDelta(5);
        System.out.println(c1.toString());
    }
}
