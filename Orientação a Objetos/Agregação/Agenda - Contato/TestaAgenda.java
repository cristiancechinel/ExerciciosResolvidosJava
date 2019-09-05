public class TestaAgenda {
    public static void main(String[] args){
        Contato dd = new Contato("jose", "jose@hotmail.com", "333-4444");
        Contato ee = new Contato("ana", "jose@hotmail.com", "333-4444");
        
        System.out.println(dd.equals(ee));
        
        Agenda a = new Agenda();
        
        a.cadastrar(dd);
        a.cadastrar(ee);
      
        System.out.println(a);
        
    }
}
