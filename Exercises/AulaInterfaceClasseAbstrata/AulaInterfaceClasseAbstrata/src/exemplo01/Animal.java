package exemplo01;

public class Animal extends Object implements Som {
    private double peso;
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void emitirSom() {
        System.out.println("grhrgr");
    }
}
