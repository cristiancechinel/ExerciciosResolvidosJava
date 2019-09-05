
public class TestaHora {
    public static void main(String args[]) {
        Hora h1 = new Hora(64, 2, -1);
        Hora h2 = new Hora(0,0,0);
        h2.setTime(17, 2, 80);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
    }
}
