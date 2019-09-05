public class MetodoErro {
    
    public static void metodo1(){
        System.out.println("inicio do metodo 2");
        int a[] = new int[10];
        for (int i = 0; i < 15; i++){
            a[i] = i;
            System.out.println(i);
        }
        System.out.println("fim do metodo 2");
    
    }
        
    public static void main(String[] args){
        System.out.println("inicio do principal");
        metodo1();
    }
}
