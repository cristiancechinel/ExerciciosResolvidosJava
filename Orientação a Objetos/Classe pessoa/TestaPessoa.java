
public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Arthur", 20);
        Pessoa p2 = new Pessoa("Natalia", 19);

        p1.fazAniversario();
        p2.fazAniversario();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

