
public class TestaAnimal {
	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero("rex",	"cachorro", "canino", 2, "peludo");

		Ave andorinha = new Ave("and","passaro", "aves", 2, "curto");

		System.out.println(cachorro.alimentar());
		System.out.println(andorinha.voar());
	}

}
