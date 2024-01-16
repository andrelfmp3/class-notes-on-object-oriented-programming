package exemplos;

public class MatrizPlus {
    public static void main(String[] args) {
        
        int[][] ragged = new int[3][];
        
        ragged[0] = new int[5];
        ragged[1] = new int[3];
        ragged[2] = new int[4];
        
        // ragged.length é o número de linhas
//        for (int i = 0; i < ragged.length; i++) {
//            // ragged[0].length é o número de colunas da linha i
//            for (int j = 0; j < ragged[i].length; j++) {
//                System.out.print(ragged[i][j] + " ");
//            }
//            System.out.println("");
//        }

        // for enhanced
        for(int[] linha : ragged){
            for(int celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println("");
        }
        
        
    }
}
