package app;

import java.math.BigDecimal;

public class BigNumbers{
    public static void main(String[] args) {
        double valor = 2.0;
        BigDecimal valor1 = BigDecimal.valueOf(valor);
        BigDecimal valor2 = BigDecimal.valueOf(1.1);

        BigDecimal resultado = valor1.subtract(valor2);

        System.out.println(resultado);
    }
}