
public class Pessoa{
    private	String name;
    private	int age;
    private	Tempo date;

	public Pessoa(String n, int a, Tempo t){
		this.name = n;
		this.age = a;
		this.date = t;
	}
	public String toString() {
        return "Nome: " + name + ", Idade: " + age + ", Data Nascimento: " + date;
    }
}
