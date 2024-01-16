package app;

public class Ragged {
    public static void main(String[] args) {
        int [][] matriz = new int[3][];
        matriz[0] = new int[5];
        matriz[1] = new int[3];
        matriz[2] = new int[4];



        // percorre a matriz (ragged array)
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
