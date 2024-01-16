package exemplo04;

import java.util.ArrayList;

public class Comunicacao {
    public static void main(String[] args) {
        SMS fonte = new SMS();
        CorreioDeVoz cv = new CorreioDeVoz();
        WhatsApp w = new WhatsApp();

        ArrayList<Servicos> fontes = new ArrayList<>();
        fontes.add(w);
        fontes.add(cv);
        fontes.add(fonte);
        
        for (Servicos f : fontes) {
            f.exibir("Veja o resultado...");
        }
        
    }
}
