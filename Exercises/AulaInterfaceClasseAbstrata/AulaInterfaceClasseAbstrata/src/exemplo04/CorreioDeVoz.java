package exemplo04;

public class CorreioDeVoz implements Servicos {

    @Override
    public void exibir(String mensagem) {
        System.out.println("Áudio com a mensagem: " + mensagem);
    }
}
