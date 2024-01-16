package exemplo04;

public class WhatsApp implements Servicos{
    
    @Override
    public void enviarImagem(String imagem){
        System.out.println("Enviando pelo whatsapp a imagem: "+ imagem);
    }
}
