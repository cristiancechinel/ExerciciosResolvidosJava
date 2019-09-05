
public class Viola extends InstrumentoCorda {

    public Viola() {
        this.setNumeroCorda(10);
    }

    public Viola(int numeroDeCordas) {
        this.setNumeroCorda(numeroDeCordas);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando viola");
    }

}
