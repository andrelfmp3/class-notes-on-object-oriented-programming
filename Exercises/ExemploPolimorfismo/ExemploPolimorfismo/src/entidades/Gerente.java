package entidades;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private double abonoSalarial;
    private ArrayList<Vendedor> subordinados;
    
    public Gerente(String nome, String cpf){
        super(nome, cpf); // chama o construtor não-padrão da classe base
        subordinados = new ArrayList<>();
    }

    @Override
    public String toString(){
        String texto = super.toString();

        return (texto + "; abono: " + abonoSalarial);
    }

    /*
     * definirAbono
     * A partir de um montante de vendas dos vendedores,
     * os quais o gerente acompanha é definido um valor de abono.
     */
    public void definirAbono(double montanteVendas){
        // 5% do montante de vendas
        abonoSalarial = montanteVendas * 0.05;
    }

    // polimorfismo ad-hoc
    // sobrecarga de método
    public void definirAbono(){
        double montante = calcularMontanteDeVendas();
        abonoSalarial = montante * 0.05;
    }

    @Override
    public double getSalario(){
        double base = super.getSalario();

        return (base + abonoSalarial);
    }

    public void incluirSubordinado(Vendedor v){
        subordinados.add(v);
    }

    public void excluirSubordinado(Vendedor v){
        subordinados.remove(v);
    }

    public double calcularMontanteDeVendas(){
        double montante = 0.0;

        for (Vendedor vendedor : subordinados) {
            montante += vendedor.getTotalDeVendas();
        }

        return montante;
    }

}
