package app;

import javax.swing.JOptionPane;

public class Wrappers {
    public static void main(String[] args) {
        // Integer = int (autoboxing)
        Integer valor = Integer.parseInt("10");
        Integer resultado = valor * 2;

        System.out.println(resultado);

        // unboxing
        int v = valor;
        System.out.println(v);

        String resposta = JOptionPane.showInputDialog("Digite a altura");
        
        double dValor = Double.parseDouble(resposta);
        System.out.println("Calculo: " + (dValor * 2));

    }
}
