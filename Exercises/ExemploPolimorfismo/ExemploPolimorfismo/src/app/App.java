package app;

import java.util.ArrayList;

import entidades.Funcionario;
import entidades.Gerente;
import entidades.Vendedor;

public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ricardo", "123");
       
        Vendedor v1 = new Vendedor("Luciano", "987");        
        v1.registraVenda(500);

        Vendedor v2 = new Vendedor("Rebeca", "657");
        v2.registraVenda(1000);

        Gerente g1 = new Gerente("Roberval", "456");        
        //g1.definirAbono(10000);
        g1.incluirSubordinado(v1);
        g1.incluirSubordinado(v2);
        System.out.println(g1.calcularMontanteDeVendas());

        Gerente g2 = new Gerente("Samanta", "432");        
        //g2.definirAbono(5000);
        System.out.println(g2.calcularMontanteDeVendas());
        
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(g1);
        funcionarios.add(v1);
        funcionarios.add(v2);
        funcionarios.add(g2);

        // processamento polimorfico!
        for (Funcionario funcionario : funcionarios) {
            // envia uma mensagem para todos os objetos
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getSalario());
            System.out.println("-----");
        }

        /*for(int i = 0; i < funcionarios.size(); i++){
            Funcionario funcionario = funcionarios.get(i);
            System.out.println(funcionario.getSalario());
        }*/

    }
}
