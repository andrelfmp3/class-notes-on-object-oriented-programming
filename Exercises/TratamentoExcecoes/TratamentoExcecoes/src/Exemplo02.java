public class Exemplo02 {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = lancaExcecao(2);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção!");
        }
        System.out.println(resultado);
    }

    public static int lancaExcecao(int valor)
            throws Exception {
        if (valor < 5) {
            // lança a exceção!
            throw new Exception("Valor não pode ser menor que 5!");
        }
        return (valor * 2);
    }
}
