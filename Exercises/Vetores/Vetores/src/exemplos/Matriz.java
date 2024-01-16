package exemplos;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];

        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;

        // matriz.length é o número de linhas
        for (int i = 0; i < matriz.length; i++) {
            // matriz[0].length é o número de colunas da linha 0
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
