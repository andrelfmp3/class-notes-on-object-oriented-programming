public class App {

    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 0;

        int resultado = 0;
        try {
            // pode ocorrer uma exceção
            resultado = valor1 / valor2;
            System.out.println("Realizei a divisão");
        }
        catch(ArithmeticException e){
            System.err.println("Divisão por zero");
        }
        catch(Exception e){
            System.out.println("bloco Excepetion");
        }
        finally {
            System.out.println("Estou no bloco finally");
        }

        System.out.println(resultado);
    }
}
