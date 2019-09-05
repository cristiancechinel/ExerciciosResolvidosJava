
import java.lang.Math;

public class Circulo extends Forma{
    private double raio;
    Circulo(double r) {
        this.raio = r;
    }
    @Override
    public double getArea(){
        return Math.PI * this.raio * this.raio;
    }
    @Override
    public double getPerimetro(){
        return Math.PI * 2 * this.raio;
    }
    @Override
    public String getNome(){
        return "Circulo";
    }
    @Override
    public String toString(){
        return this.getClass().getName() + " \n raio = "+ this.raio + " \n area = "+ this.getArea() + " \n perametro = "+ this.getPerimetro();
    }

}
