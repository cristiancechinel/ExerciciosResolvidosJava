public class Avaliacao{
    private int numero;
    private Questao q1;
    private Questao q2;
    private Questao q3;

    public Avaliacao(int n, Questao a, Questao b, Questao c){
        this.numero = n;
        this.q1=a;
        this.q2=b;
        this.q3=c;
    }
    public String toString(){
        return "Avaliacao " + numero+ "\n\n"+ q1 +"\n"+q2+"\n"+q3;
    }
}
