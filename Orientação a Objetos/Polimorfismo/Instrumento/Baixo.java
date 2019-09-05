
public class Baixo extends InstrumentoCorda {

    public Baixo() {
        this.setNumeroCorda(4);
    }

    public Baixo(int numeroDeCordas) {
        this.setNumeroCorda(numeroDeCordas);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando baixo");
    }

}
