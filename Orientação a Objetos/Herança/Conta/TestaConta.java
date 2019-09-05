
public class TestaConta{
    public static void main(String[] args){

        Conta c1 = new Conta("Paulo", "12345","123-1",2000);
        ContaCorrente c2= new ContaCorrente("Claudio", "12345", "123-2", 5000);
        ContaPoupanca c3 = new ContaPoupanca("Caio", "12345", "123-3", 7000);
        ContaInvestimento c4 = new ContaInvestimento("Gustavo","12345","123-4", 1000);

        c1.atualizar();
        c2.atualizar();
        c3.atualizar();
        c4.atualizar();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        c1.saque(2000);
        c2.saque(2000);
        c3.saque(2000);
        c4.saque(2000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        c1.deposito(3000);
        c2.deposito(3000);
        c3.deposito(3000);
        c4.deposito(3000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        c1.transferePara(c2, 1000);
        c2.transferePara(c3, 2000);
        c3.transferePara(c4, 3000);
        c4.transferePara(c1, 4000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
