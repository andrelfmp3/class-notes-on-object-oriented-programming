package exemplo00;

public class Pessoa {
    protected String nome;
    private int idade;
    private String cpf;
    
    // construtor padrão
    public Pessoa(){ }
    
    // construtor não-padrão
    public Pessoa(String nome, int idade,
            String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public Pessoa(String nome){
        // construtor não-padrão
        this(nome, 20, "111");
    }
    
    public final int getIdade(){
        return idade;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public String meuNomeEh(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
