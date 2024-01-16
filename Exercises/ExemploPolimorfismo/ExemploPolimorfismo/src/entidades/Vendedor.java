package entidades;

public class Vendedor extends Funcionario {

    private double totalDeVendas;

    public Vendedor(String nome, String cpf) {
        super(nome, cpf);
        totalDeVendas = 0.0;
    }

    public void registraVenda(double valor) {
        if (valor > 0.0) {
            this.totalDeVendas += valor;
        }
    }

    public double calcularComissao(){
        double comissao = totalDeVendas * 0.01; // 1% do total de vendas
        return comissao;
    }

    @Override
    public double getSalario(){
        double comissao = calcularComissao();
        double base = super.getSalario();

        return (comissao + base);
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

}
