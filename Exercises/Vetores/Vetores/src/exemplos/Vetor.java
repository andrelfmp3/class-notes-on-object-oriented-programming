package exemplos;

import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        
        // int [] idades = new int[4];        
        int [] idades; // declarei o vetor que guardará idades        
        idades = new int[4]; // define o tamanho do vetor!
        
        idades[0] = 20; // armazeno o valor 20 na primeira posição
        idades[1] = 30;
        idades[2] = 15;
        idades[3] = 32;
        
        for(int i = 0; i < idades.length; i++){
            System.out.print( idades[i] + " ");
        }
        System.out.println("");
        
        // for enhanced (for melhorado) / iteração / leitura
        for(int valor : idades){
            System.out.print( valor + " ");
        }
        System.out.println(Arrays.toString(idades));
        System.out.println("");
    }    
}
