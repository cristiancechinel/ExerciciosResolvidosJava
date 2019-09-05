public class TesteAvalicaoQuestao{
    public static void main(String[] args){

        Questao calc1 = new Questao("Calcule as raizes: x^2+1");
        Questao calc2 = new Questao("Plot a seguinte equacao: x^2+4");
        Questao calc3 = new Questao("Encontre a serie para x^2+16");

        Avaliacao first = new Avaliacao(1, calc1, calc2, calc3);

        System.out.println(first);
    }
}
