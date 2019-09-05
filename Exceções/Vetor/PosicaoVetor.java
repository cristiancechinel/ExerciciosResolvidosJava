public class PosicaoVetor {
    
	public static void main(String args[]){
		try{
			int a[] = new int[2];
			System.out.println("Acessando a posicao 3 :" + a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Acesso a posicao inexistente:" + e);
		} 
		finally {
			System.out.println("Termino do programa");
		}
	}
}
