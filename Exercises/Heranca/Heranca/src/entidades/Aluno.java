package entidades;

// classe Aluno é derivada de Pessoa
public class Aluno extends Pessoa {
    String curso;
    Double ira;
    
    public Aluno(){
        // acessa o atributo da classe mãe,
        // pois o modificador é default OU protected
        //nome = "Gabriel";

        // acesso quando o atributo é privado
        //setNome("Gabriel");
    }
}
