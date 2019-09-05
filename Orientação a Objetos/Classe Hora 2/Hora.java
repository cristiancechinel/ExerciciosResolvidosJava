
public class Hora{
    private int h;
    private int min;
    private int seg;

    Hora(int h, int min, int seg){
        setTime(h, min, seg);
    }

    void setTime(int h, int min, int seg){
        setH(h);
        setMin(min);
        setSeg(seg);
    }

    void passa1Segundo(){
        if (this.seg < 59)
            this.seg++;
        else {
            this.seg = 0;
            passa1Minuto();
        }
    }
    void passa1Minuto(){
        if (this.min < 59)
            this.min++;
        else{
            this.min = 0;
            passa1Hora();
        }
    }
    void passa1Hora(){
        if (this.h < 23)
            this.h++;
        else
            this.h = 0;
    }

    void setH(int h){
        if (h >= 0 && h <= 23)
            this.h = h;
        else
            this.h = 0;
    }
    void setMin(int min){
        if (min >= 0 && min <=59)
            this.min = min;
        else
            this.min = 0;
    }
    void setSeg(int seg){
        if (seg >=0 && seg <= 59)
            this.seg = seg;
        else
            this.seg = 0;
    }
    int getH(){
        return this.h;
    }
    int getMin(){
        return this.min;
    }
    int getSeg(){
        return this.seg;
    }

    @Override
    public String toString(){
        return this.getClass().getName() + ": h = " + this.h + ", min = " + this.min + ", seg = " + this.seg;
    }
}
