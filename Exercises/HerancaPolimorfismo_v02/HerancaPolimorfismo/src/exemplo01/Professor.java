package exemplo01;

import exemplo00.Pessoa;

public class Professor extends Pessoa{
    private String formacao;
    
    public void setFormacao(String formacao){
        // eh possivel acessar, pois esta
        // como protected
        //nome = "João";
        this.formacao = formacao;
    }
    
    public String getFormacao(){
        return formacao;
    }
}
