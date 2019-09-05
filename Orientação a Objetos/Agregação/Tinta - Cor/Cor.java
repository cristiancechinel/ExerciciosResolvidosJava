
public class Cor{
    private int r;
    private int g;
    private int b;

    Cor(int r, int g, int b){
        this.setR(r);
        this.setG(g);
        this.setB(b);
    };

    public void setR(int r){
        this.r = r;
    };

    public int getR(){
        return this.r;
    };

    public void setG(int g){
        this.g = g;
    };

    public int getG(){
        return this.g;
    };

    public void setB(int b){
        this.b = b;
    };

    public int getB(){
        return this.b;
    };

    @Override
    public String toString(){
        return this.getClass().getName() + ": r = " + this.r + ", g = " + this.g + ", b = " + this.b;
    };
}
