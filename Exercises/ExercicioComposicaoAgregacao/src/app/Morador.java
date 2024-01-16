package app;

public class Morador {
    String nome;
    char sexo;
    int idade;

    // eh uma boa pratica toda classe
    // redefinir o método toString
    // Override => sobrescrever
    // cenas dos próximos capítulos...
    @Override
    public String toString() {
        return "[nome: " + nome +
            "; sexo: "+ sexo + "; idade: " +
            idade + "]";
    }
}
