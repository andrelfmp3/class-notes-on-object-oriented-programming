package exemplo02;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Pessego");
        lista.add("Coco");
        lista.add("Kiwi");
        lista.add("Pequi");
        lista.add("Umbu");
        lista.add("Figo");
        lista.add("Mirtilo");
        
        // ordenando os valores
        Collections.sort(lista);
        
        for(String e : lista){
            System.out.println(e);
        }
        
    }
    
}
