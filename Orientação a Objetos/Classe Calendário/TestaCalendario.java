public class TestaCalendario{   

    public static void main(String[] args){
        Calendario novo = new Calendario(02, 01, 2018);
        System.out.println(novo);
        
        Calendario antigo = new Calendario(02, 01, 2018);
        System.out.println(antigo);
        
        System.out.println(novo.equals(antigo));
        
    }

}