
public class Contador {
    String nome;
    int contagem;
    int maximo;

    Contador(String nome, int contagem, int maximo) {
        this.nome = nome;
        this.contagem = contagem;
        this.maximo = maximo;
    }

    void incrementa() {
        if (this.contagem < this.maximo)
            this.contagem += 1;
    }

    void incrementaDelta(int delta) {
        this.contagem += delta;
    }

    void reseta() {
        this.contagem = 0;
    }

    @Override
    public String toString(){
        return this.getClass().getName() + ": nome = "+this.nome+", contagem = "+this.contagem+", maximo = "+this.maximo;
    }
}
