package jogo;

public class TesteJogo {
    public static void main(String[] args) {
        Goleiro goleiro = new Goleiro();
        goleiro.setTime("Real Madrid");

        Batedor batedor = new Batedor();
        batedor.setTime("Real Madrid");
        batedor.setCamisa(9);

        System.out.println(goleiro.getCamisa());

        goleiro.cobrancaAutorizada();
        batedor.cobrancaAutorizada();

    }
}
