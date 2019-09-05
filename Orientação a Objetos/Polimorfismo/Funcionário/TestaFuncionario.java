
public class TestaFuncionario{
    public static void main(String[] args){
       TrabalhadorHora t1 = new TrabalhadorHora("Carlos","Alberto",40,5);
       TrabalhadorProducao t2 = new TrabalhadorProducao("Joao","Silva",20,50);
       System.out.println(t1.toString()+", salario = "+t1.salario());
       System.out.println(t2.toString()+", salario = "+t2.salario());
    }
}
