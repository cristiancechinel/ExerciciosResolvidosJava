public class ContaBancaria {
    private float saldo;
    private float limite;
    
    ContaBancaria(float lim){
        this.saldo = 0;
        this.limite = lim;
    }
    
    
    public void consultaSaldo(){
        System.out.println("Saldo = "+ this.saldo);
        System.out.println("Limite = "+ this.limite);
    }
    
    public void depositaValor(float valor){
        if (valor > 0)
            this.saldo = this.saldo + valor;
    }
    
    public boolean saque (float valor){
        if (valor <= this.saldo + this.limite) {
            this.saldo = this.saldo - valor;
            return true;
        }
        else return false;
    }
    
    public void transferencia(float valor, ContaBancaria destino){
        if (this.saque(valor))
            destino.depositaValor(valor);
    
    }
    
}
