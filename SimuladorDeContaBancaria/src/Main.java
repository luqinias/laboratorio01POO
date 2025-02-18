import java.time.LocalDate;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
    this.titular = titular;
    this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
    saldo += valor;
    }
    public void sacar(double valor) {
    if (saldo >= valor) saldo -= valor;
    else System.out.println("Saldo insuficiente!");
    }
    public void mostrarSaldo() {
    System.out.println("Saldo de " + titular + ": R$" + saldo);
    }
}
class Pessoa {
    private String nome;
    private final String cpf;
    private final LocalDate nascimento;
    private int telefone;

    public Pessoa(String nome, String cpf, LocalDate nascimento, int telefone) {
    this.nome = nome;
    this.cpf = cpf;
    this.nascimento = nascimento;
    this.telefone = telefone;

    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCpf() {return cpf;}
    public LocalDate getNascimento() {return nascimento;}
    public int getTelefone() {return telefone;}
    public void setTelefone(int telefone) {this.telefone = telefone;}


    public void mostrarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + nascimento);
        System.out.println("Telefone: " + telefone);
        }

}
public class Main {
    public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Maria", "60356288860",LocalDate.parse("2000-01-01"), 87654328);
    ContaBancaria conta = new ContaBancaria("Maria");
    
    conta.depositar(100);
    conta.sacar(30);
    System.out.println("------------Saldo da conta------------");
    conta.mostrarSaldo();
    System.out.println("-----------Titular da conta-----------");
    p1.mostrarPessoa();

    }
}