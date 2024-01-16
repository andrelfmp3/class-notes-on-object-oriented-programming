package exemplo01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Gato g = new Gato();
        g.setPeso(11.3);
        
        Cachorro c = new Cachorro();
        c.setPeso(7.2);
        
        Radio r = new Radio("92.1", "KissFM",
                "Música não tem idade, tem história!");
        
        ArrayList<Som> lista = new ArrayList<>();
        lista.add(c);
        lista.add(g);
        lista.add(r);
        
        // processamento polimorfico
        for (Som s : lista) {
            s.emitirSom();
        }
    }
}
