public class Metodo2 {
    
    public static void metodo1(){
        System.out.println("inicio do metodo 1");
        int a[] = new int[10];
        try{
            for (int i = 0; i < 15; i++){
                a[i] = i;
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println("posicao inexistente");
        }
        System.out.println("fim do metodo 1");
    
    }
        
    public static void main(String[] args){
        System.out.println("inicio do principal");
        metodo1();
    }
}
