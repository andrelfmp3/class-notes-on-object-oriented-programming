package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VetorDinamico {
    public static void main(String[] args) {
        // objeto da classe ArrayList que trabalhará com String
        // ArrayList<Tipo> nome-objeto = new ArrayList();
        ArrayList<String> nomes = new ArrayList();
        nomes.add("João");
        nomes.add("Roberto");
        nomes.add("Ana");
        
        System.out.println(nomes.isEmpty());
        System.out.println("Tamanho: " + nomes.size());
        System.out.println("nomes[2]: " + nomes.get(2));
        nomes.set(1, "Ricardo"); // alterar o valor que esta na posicao 1
        System.out.println("nomes[1]: " + nomes.get(1));
        
        Collections.sort(nomes);

        // converte o objeto ArrayList para Object[]
        Object[] temp = nomes.toArray();
        System.out.println(Arrays.toString(temp));
        
        nomes.clear(); // remove os elementos
        System.out.println("Tamanho: " + nomes.size());
        
        
    }
}
