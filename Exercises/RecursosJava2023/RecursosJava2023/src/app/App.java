package app;
public class App {
    public static void main(String[] args) {
        // 1 - domingo, 2 - segunda ..., 7 - sábado
        //int dia;
        //String [] dias = {"Domingo", "Segunda", "Terça"};

        //int dia = DiasConstante.DOMINGO;
        //System.out.println(dia);
        Pessoa p1 = new Pessoa();
        System.out.println(Pessoa.getInstancias());
        Pessoa p2 = new Pessoa();
        System.out.println(Pessoa.getInstancias());

    }
}
