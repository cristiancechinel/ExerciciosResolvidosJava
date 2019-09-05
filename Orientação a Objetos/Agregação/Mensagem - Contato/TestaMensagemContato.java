
public class TestaMensagemContato {
    public static void main(String args[]){
        Contato contato1 = new Contato("Anderson",999804321,55);
        Contato contato2 = new Contato("Gabriel",999721234,48);
        Mensagem msg1 = new Mensagem("Bom dia!",contato1,contato2);
        System.out.println(msg1.toString());
    }
}
