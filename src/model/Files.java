/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lucas.Testoni
 */
public class Files {

    private Files() throws IOException {
        File diretorio = new File("Dados");
        File despesa = new File("Dados\\Despesas.csv");
        File receita = new File("Dados\\Receita.csv");
        if (!diretorio.exists()){
            diretorio.mkdir();
            if (!(receita.exists ()&& despesa.exists())){
            despesa.createNewFile();
            receita.createNewFile();
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Files();
    }
}
