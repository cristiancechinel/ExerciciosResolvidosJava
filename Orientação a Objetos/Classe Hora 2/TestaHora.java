
public class TestaHora {
    public static void main(String[] args){
        Hora hora = new Hora(23,58,57);
        System.out.println(hora.toString());
        hora.passa1Segundo();
        System.out.println(hora.toString());
        hora.passa1Minuto();
        hora.passa1Segundo();
        System.out.println(hora.toString());
        hora.passa1Segundo();
        System.out.println(hora.toString());
    }
}
