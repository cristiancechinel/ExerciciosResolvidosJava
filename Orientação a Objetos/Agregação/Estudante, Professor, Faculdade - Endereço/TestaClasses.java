public class TestaClasses {
    public static void main(String[] args) {
        Endereco e = new Endereco(123456, "Ararangua", "SC", "Brasil");
        Endereco e2 = new Endereco(22146, "Bom jardim", "SC", "Brasil");
        Endereco e4 = new Endereco(1462, "Chapeco", "SC", "Brasil");
        Faculdade f = new Faculdade(465789, e4, "UFFS");
        Estudante est = new Estudante(798465465, "Josias", e2);
        Professor prof = new Professor("Cristiano", e);

        System.out.println("--------Teste1---------");
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e4);
        System.out.println(f);
        System.out.println(est);
        System.out.println(prof);

        System.out.println("--------Teste2---------");
        f.setEndereco(e);
        est.setEndereco(e);
        prof.setEndereco(e);
        System.out.println(f);
        System.out.println(est);
        System.out.println(prof);
        //alterando valores de endereco
        e.setNumeroRua(244455);
        e.setEstado("PR");
        e.setCidade("Curitiba");

        System.out.println("--------Apos alteracao---------");
        System.out.println(f);
        System.out.println(est);
        System.out.println(prof);
    }
}
