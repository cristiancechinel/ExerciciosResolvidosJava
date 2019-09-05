
public class Quadrado extends Forma{
    private double lado;

    public Quadrado(double l){
        this.lado = l;
    }
    @Override
    public double getArea(){
        return this.lado * this.lado;
    }
    @Override
    public double getPerimetro(){
        return this.lado * 4;
    }
    @Override
    public String getNome(){
        return "Quadrado";
    }
    @Override
    public String toString(){
        return this.getClass().getName() + "\n lado = "+ this.lado + "\n area = " + this.getArea() + "\n perametro = "+this.getPerimetro();
    }

}
