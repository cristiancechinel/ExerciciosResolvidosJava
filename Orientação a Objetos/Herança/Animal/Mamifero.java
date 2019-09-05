
public class Mamifero extends Animal {
	protected String tipoPelagem;

	Mamifero() {
		this.tipoPelagem = "";
	}

	Mamifero(String nome, String especie, String familia, int idade, String pelagem) {
		super(nome, especie, familia, idade);
		this.tipoPelagem = pelagem;
	}

	@Override
	String alimentar() {
		return " Alimentou na classe Mamifero";
	}
}
