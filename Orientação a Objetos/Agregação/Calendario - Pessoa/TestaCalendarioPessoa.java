public class TestaCalendarioPessoa {
    public static void main(String[] args){
        Calendario data = new Calendario(23, 04, 1980);
        Pessoa p = new Pessoa ("joao", 38, data);
        System.out.println(p.toString());
        
        System.out.println("Nome = "+ p.getNome());
        System.out.println("Idade = "+ p.getIdade());
        System.out.println("Nascimento = "+p.getDataNascimento().getDia()+"/"+ 
                p.getDataNascimento().getMes()+"/"+
                p.getDataNascimento().getAno());
        
        
    }
    
}
