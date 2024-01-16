package app;

public class Apartamento {
    int numero;
    int andar;
    double area; // m²
    Morador morador; // atributo

    // método
    void addMorador(Morador morador){
        // atributo = parametro
        // qdo os nomes são == o this é obrigatorio
        // c.c. o this é opcional
        this.morador = morador;
    }

    @Override
    public String toString() {
        String dadosMorador =
            morador == null ? "sem morador" : morador.toString();

        String mensagem = "[apto: " +
        numero + "; andar: "+ andar +
        "; area: "+ area + "m²]\n" +
        "\t" + dadosMorador;

        return mensagem;
    }
}
