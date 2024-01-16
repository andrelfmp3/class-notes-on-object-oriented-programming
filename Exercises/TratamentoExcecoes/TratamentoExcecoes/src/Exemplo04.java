public class Exemplo04 {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(100);

        try{
        conta.sacar(200);
        }
        catch(ValorExcecao e){
            System.out.println(e.getMessage());
        }
    }
}
