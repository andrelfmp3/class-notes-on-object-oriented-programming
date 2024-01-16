package exemplos;

public class VetorTAD {
    public static void main(String[] args) {
        String[] nomes = {"João", "Roberto", "Ana"};
        
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        // lembra a chamada a um construtor!
        // mas, cuidado, neste caso é a criação de um vetor
        Pessoa[] listaVip = new Pessoa[3];
        listaVip[0]       = new Pessoa(20); // objeto na posição 0 tem idade 20
        listaVip[1] = new Pessoa();
        listaVip[2] = new Pessoa();
    }
}
