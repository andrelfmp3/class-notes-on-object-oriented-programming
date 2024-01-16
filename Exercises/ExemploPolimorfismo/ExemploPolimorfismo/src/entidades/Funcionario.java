package entidades;

// filha da classe Object
public class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    // construtor não-padrão
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 1500;
    }

    private Funcionario(){}

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Nome: "+ nome + "; CPF: " + cpf + "; Salário base: " + salario;
    }
}
