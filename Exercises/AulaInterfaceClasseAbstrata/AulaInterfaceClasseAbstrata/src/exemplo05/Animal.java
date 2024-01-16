package exemplo05;

public abstract class Animal {
    private double peso;

    public Animal(double peso) {
        this.peso = peso;
    }

    public Animal() {
        this(3.0);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public abstract void emitirSom();
}
