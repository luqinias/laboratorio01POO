class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String naturalidade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    
    }
    public Pessoa(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;

    }
    public Pessoa(String nome, int idade, String cpf, String naturalidade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.naturalidade = naturalidade;
    
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNaturalidade() { return naturalidade; }
    public void setNaturalidade(String naturalidade) { this.naturalidade = naturalidade; }

}
public class Main {
    public static void main(String[] args) {
    Pessoa p = new Pessoa("João", 25);
    System.out.println("Nome: " + p.getNome());
    System.out.println("Idade: " + p.getIdade());
    System.out.println("-------------------------------");
    Pessoa p1 = new Pessoa("Lucas", 21, "66733092026");
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Idade: " + p1.getIdade());
    System.out.println("CPF: "+ p1.getCpf());
    System.out.println("-------------------------------");
    Pessoa p2 = new Pessoa("Igor", 30, "66735555526", "brasileiro");
    System.out.println("Nome: " + p2.getNome());
    System.out.println("Idade: " + p2.getIdade());
    System.out.println("CPF: "+ p2.getCpf());
    System.out.println("Naturalidade: " +p2.getNaturalidade());

    }
}