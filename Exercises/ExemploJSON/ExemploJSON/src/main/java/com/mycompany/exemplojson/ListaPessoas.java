package com.mycompany.exemplojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListaPessoas {
    public static void main(String[] args) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        
        // habilita a formatação no arquivo json
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String caminhoDoArquivo =
                "C:\\Users\\sp070142\\Documents\\dados.json";
        
        File arquivo = new File(caminhoDoArquivo);
        // Lista de objetos da classe Pessoa
        ArrayList<Pessoa> lista;
        
        if(arquivo.exists()){
            TypeFactory tipo = objectMapper.getTypeFactory();
            CollectionType colecao =
                    tipo.constructCollectionType(ArrayList.class, Pessoa.class);
            lista = objectMapper.readValue(arquivo, colecao);
        } else {
            lista = new ArrayList<>();
        }
        
        lista.remove(1);
        //System.out.println(lista.size());
        
        for(Pessoa pessoa : lista){
            System.out.println(pessoa);
        }

        
        /*lista.add(new Pessoa("Joao", 19, "123"));
        lista.add(new Pessoa("Marcia", 20, "456"));
        lista.add(new Pessoa("Carlos", 30, "789"));*/
        
        try {
            objectMapper.writeValue(arquivo, lista);
        } catch (IOException ex) {
            System.err.println("Erro ao ler o arquivo");
        }
        
        
    }
}
