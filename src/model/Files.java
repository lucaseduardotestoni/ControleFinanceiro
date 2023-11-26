
package model;

import java.io.File;
import java.io.IOException;

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
    
}
