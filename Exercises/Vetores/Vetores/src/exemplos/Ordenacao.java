package exemplos;

import java.util.Arrays;

public class Ordenacao {

    public static void exibir(int[] vetor) {
        for (int n : vetor) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] nomes = {"João", "Roberto", "Ana"};
        int[] numeros = {6, 20, 3, 70};
        exibir(numeros);

        Arrays.sort(nomes);
        //Arrays.sort(numeros);
        int[] teste = Arrays.copyOfRange(numeros, 1, 3);
        exibir(teste);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        int[] dados = new int[100];
        Arrays.fill(dados, -1);
        exibir(dados);

    }
}
