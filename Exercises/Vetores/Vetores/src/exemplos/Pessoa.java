package exemplos;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
    }
    
    // construtor não-padrão!!
    public Pessoa(int idade){
        this.idade = idade;
    }
}
