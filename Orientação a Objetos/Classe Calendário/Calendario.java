public class Calendario{
    private int dia, mes, ano;
    
    Calendario(int d, int m, int a){
        this.ano = a;
        if (m == 4 || m == 6 || m==9 || m==11){
            this.mes = m;
            if (d >= 1 && d <= 30){
                this.dia =d;
            }
            else{
                this.dia =1;
            }
        }
        else
            if (m == 1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12){
                this.mes = m;
                if (d >=1 && d <=31){
                    this.dia = d;
                }
                else {
                    this.dia = 1;
                }
            }
            else {
                if (m == 2) {
                    this.mes = m;
                    if (d >=1 && d<=29){
                        this.dia = d;
                    }
                    else{
                        this.dia = 1;
                    }
                }
                else {
                    this.mes = 1;
                    this.dia = 1;
                }
            }
    }
    
    int getDia(){
        return dia;
    }
    int getMes(){
        return mes;
    }
    int getAno(){
        return ano;
    }
    @Override 
    public String toString(){
        return "Data: "+this.dia+"/"+ this.mes+"/"+ this.ano;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Calendario)) return false;
        Calendario c = (Calendario) o;
        return this.dia == c.dia && this.mes == c.mes && this.ano == c.ano;
    }
}