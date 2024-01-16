package app;

public class Pessoa {
    private static int instancias = 0;

    public Pessoa(){
        instancias++;
    }

    public static int getInstancias(){
        return instancias;
    }
}
