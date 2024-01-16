package exemplo03;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private double ira;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double ira) {
        this.nome = nome;
        this.ira = ira;
    }
    
    @Override
    public int compareTo(Aluno outro) {
        if (ira < outro.ira) return -1;
        if (ira == outro.ira) return 0;
        return 1;        
    }

    public String getNome() {
        return nome;
    }
    
}
