package app;

public class Predio {
    int numeroDeAndares;
    String bloco;
    Apartamento apto1; // declaração
    Apartamento apto2; // declaração

    // construtor padrão
    public Predio() {
        apto1 = new Apartamento();
        apto1.andar = 1;
        apto1.area = 45;
        apto1.numero = 10;

        apto2 = new Apartamento();
        apto2.andar = 2;
        apto2.area = 45;
        apto2.numero = 20;

        numeroDeAndares = 2;
    }

    @Override
    public String toString() {
        String mensagem = "[predio: "+
            numeroDeAndares + " andares" +
            "; bloco: " + bloco + "]\n";

        mensagem = mensagem +
            "\t" + apto1.toString() +
            "\n\t" + apto2.toString();

        return mensagem;        
    }
}
