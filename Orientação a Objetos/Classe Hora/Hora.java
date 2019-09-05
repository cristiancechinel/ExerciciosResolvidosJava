
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    Hora(int h, int m, int s){
        this.setTime(h,m,s);
    }

    public void setTime(int h, int m, int s) {
        this.setHora(h);
        this.setMinuto(m);
        this.setSegundo(s);
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24)
            this.hora = hora;
        else
            this.hora = 0;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60)
            this.minuto = minuto;
        else
            this.minuto = 0;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60)
            this.segundo = segundo;
        else
            this.segundo = 0;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+": " + this.hora + ", Minuto = " + this.minuto + ", Segundo = " + this.segundo;
    }
}
