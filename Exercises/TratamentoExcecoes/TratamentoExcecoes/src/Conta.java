public class Conta {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws ValorExcecao {
        if (valor > this.saldo) {
            throw new ValorExcecao("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }
}
