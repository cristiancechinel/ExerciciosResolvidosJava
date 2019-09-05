
public class Guitarra extends InstrumentoCorda {

    public Guitarra() {
        this.setNumeroCorda(6);
    }

    public Guitarra(int numeroDeCordas) {
        this.setNumeroCorda(numeroDeCordas);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando guitarra");
    }

}
