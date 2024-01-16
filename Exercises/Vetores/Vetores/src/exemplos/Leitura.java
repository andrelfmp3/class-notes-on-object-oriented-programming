package exemplos;

import java.util.Scanner;

public class Leitura {
    
    public static void exibir(double [] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print( vetor[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        double[] alturas;
        int tamanho;
        Scanner teclado = new Scanner(System.in);

        // define o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        tamanho = teclado.nextInt();

        // criar o vetor
        alturas = new double[tamanho];
        exibir(alturas); // não precisa ser Leitura.exibir(), pois já estou na classe Leitura

        // leitura do vetor
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura[" + i + "]: ");
            alturas[i] = teclado.nextDouble();
        }
        
        // calcular a média
        double soma = 0.0;
        for(double altura : alturas) {
            soma = soma + altura;
        }
        /*
        for(int i = 0; i < alturas.length; i++) {
            soma = soma + alturas[i];
        }
        */
        double media = soma/alturas.length;
        System.out.println("A média das alturas é: " + media);
        
        // calcular a variância
        double acumulador = 0.0;
        for(double altura : alturas){
            acumulador = acumulador + Math.pow( (altura - media), 2);
        }
        double variancia = acumulador / (alturas.length - 1);
        System.out.println("Variância: " + variancia);
    }
}
