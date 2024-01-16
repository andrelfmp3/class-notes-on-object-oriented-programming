package app;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite N: ");

        String resposta = teclado.nextLine();
        // ilustra o uso da classe wrapper Integer
        // No entanto, poderia ter sido teclado.nextInt()
        int n = Integer.parseInt(resposta);

        BigInteger fatorial = BigInteger.ONE;

        // calculando o fatorial
        for(int i = 2; i <= n; i++){
            // fatorial = fatorial * i            
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n+"! = " + fatorial);

        teclado.close();
    }    
}
