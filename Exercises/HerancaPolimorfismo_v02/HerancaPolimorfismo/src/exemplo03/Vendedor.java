package exemplo03;

public class Vendedor extends Funcionario {
    // atributo específico
    private double totalDeVendas;
    
    public Vendedor(String nome, String cpf){
        // chama o construtor da superclasse
        super(nome, cpf);
    }
    
    public void setTotalDeVendas(double total){
        if (total > 0){
            totalDeVendas = total;
        }
    }
    
    public double getTotalDeVendas(){
        return totalDeVendas;
    }
    
    // regra de negócio
    public double calcularComissao(){
        double comissao = 0.0;
        if (totalDeVendas <= 5000.0){
            comissao = totalDeVendas * 0.05;
        } else {
            comissao = totalDeVendas * 0.10;
        }
        return comissao;
    }
    
    @Override
    public double getSalario(){
        // salario = salarioBase + comissao
        double base = super.getSalario();
        double comissao = this.calcularComissao();
        
        return (base + comissao);
    }
    
    
}
