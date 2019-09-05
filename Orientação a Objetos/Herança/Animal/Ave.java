
public class Ave extends Animal {
	protected String tipoBico;

	Ave() {
		this.tipoBico = "";
	}

	Ave(String nome, String especie, String familia, int idade, String bico) {

		super(nome, especie, familia, idade);
		this.tipoBico = bico;
	}

	@Override
	String alimentar() {
		return " Alimentou na classe Ave";
	}

	String voar() {
		return " Classe ave voando";
	}
}
