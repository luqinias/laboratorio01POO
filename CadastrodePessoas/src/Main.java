class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
    
public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa("João", 25);
    System.out.println("Nome: " + p.getNome());
    System.out.println("Idade: " + p.getIdade());
    }
}