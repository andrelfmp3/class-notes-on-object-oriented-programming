/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author sp070142
 */
public class LerJSON {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        
        // habilita a formatação no arquivo json
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String caminhoDoArquivo =
                "C:\\Users\\sp070142\\Documents\\dados.json";
        
        File arquivo = new File(caminhoDoArquivo);
        
        try {
            
            Pessoa p = objectMapper.readValue(arquivo, Pessoa.class);
            p.setIdade(40); // alterei
            
            // escrevo o objeto no arquivo
            objectMapper.writeValue(arquivo, p);
            
            System.out.println(p);
            
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao tentar ler os dados");
            System.out.println(ex.getMessage());
        }
        
    }
}
