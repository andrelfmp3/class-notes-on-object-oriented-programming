package exemplos;

import java.util.Scanner;

public class LeituraRefatorada {

    public static void exibir(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0.0;
        for (double valor : vetor) {
            soma = soma + valor;
        }
        return (soma / vetor.length); // media
    }

    public static double calcularVariancia(double[] vetor) {
        return calcularVariancia(vetor, calcularMedia(vetor));
    }

    // sobrecarga de método
    public static double calcularVariancia(double[] vetor, double media) {
        double acumulador = 0.0;
        for (double valor : vetor) {
            acumulador = acumulador + Math.pow((valor - media), 2);
        }
        return (acumulador / (vetor.length - 1));
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
        double media = calcularMedia(alturas);
        System.out.println("A média das alturas é: " + media);

        // calcular a variância
        double variancia = calcularVariancia(alturas);
        System.out.println("Variância: " + variancia);
    }
}
