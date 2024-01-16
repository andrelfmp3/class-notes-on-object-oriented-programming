package jogo;

public class Goleiro extends Jogador {
    
    public Goleiro(){
        setCamisa(1);
    }

    @Override
    public void cobrancaAutorizada(){        
        System.out.println("Goleiro escolhe canto e pula");
    }

}
