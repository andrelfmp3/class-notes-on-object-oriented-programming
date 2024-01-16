package exemplo01;

public class Radio implements Som {
    
    private String canal;
    private String nome;
    private String slogan;

    public Radio(String canal, String nome, String slogan) {
        this.canal = canal;
        this.nome = nome;
        this.slogan = slogan;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Sintonizando " +
                canal + ": " + nome);
        System.out.println(slogan);
    }
    
}
