package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListInteiros {
    public static void main(String[] args) {
        // <> operador diamante
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10); // 10 é int, autoboxing
        numeros.add(20);
        
        
        ArrayList<Pessoa> listaVip = new ArrayList<>();
        listaVip.add(new Pessoa());
        
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Beatriz");
        int[] dados = new int[10];
        
        Arrays.sort(dados); // vetor tradicional
        Collections.sort(nomes); // ArrayList
        
        
    }
    
}
