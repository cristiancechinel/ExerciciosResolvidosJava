
public class Contador {
    private int contagem;
    private String id;

    public Contador(String id) {
        this.id = id;
    }

    public void incrementa() {
        this.contagem += 1;
    }

    public int getContagem() {
        return this.contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
