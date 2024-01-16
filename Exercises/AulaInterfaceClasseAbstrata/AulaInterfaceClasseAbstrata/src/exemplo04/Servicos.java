package exemplo04;

public interface Servicos {
    default void exibir(String mensagem){};
    default void enviarImagem(String imagem) {};
}
