
package model;

import java.io.File;
import java.io.IOException;
/**
 * Classe que Controla os Arquivos Receita.csv e Despesas.csv
 * */
public class Files {
    /**
     * Metodo que Verifica se Existe um Diretório Dados/Receita.csv
     * e Dados/Despesas.csv se não Cria
     */
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
    
}
