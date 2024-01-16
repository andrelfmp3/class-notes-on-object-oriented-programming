package jogo;

public class Jogador {
    private String time;
    private int camisa;

    public int getCamisa() {
        return camisa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public void cobrancaAutorizada(){
        System.out.println("cobrança autorizada!");
    }
}
