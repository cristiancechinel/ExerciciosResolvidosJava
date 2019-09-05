public class TesteInstrumento {
    public static void main(String[] args){
        Orquestra orquestra = new Orquestra();
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Guitarra();
        instrumentos[1] = new Baixo();
        instrumentos[2] = new Viola();
        for(int i = 0 ; i < instrumentos.length; i++){
            orquestra.espetaculo(instrumentos[i]);
        }
    }
}
