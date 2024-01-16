package exemplo04;

public class SMS implements Servicos{

    @Override
    public void exibir(String mensagem) {
        System.out.println("Enviando SMS com a mensagem: " + mensagem);
    }
    
}
