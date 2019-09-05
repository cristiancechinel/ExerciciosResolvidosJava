
public class Animal {
	protected String nome;
	protected String especie;
	protected String familia;
	protected int idade;

	Animal() {
	}

	Animal(String nome, String especie, String familia,	int idade) {
		this.nome = nome;
		this.especie = especie;
		this.familia = familia;
		this.idade = idade;
	}

	String alimentar() {
		return "Alimentou na classe Animal";
	}

}
