package model.Dao;

import java.util.Date;
import model.CategoriaDespesa;
import model.Lancamento;

public class Receita extends Lancamento {

    private CategoriaDespesa Categoria;

    public Receita(CategoriaDespesa categoria, double valor,Date dataDespesa) {
        super(valor, dataDespesa);
        this.Categoria = categoria;
    }

    public void setCategoria(CategoriaDespesa Categoria) {
        this.Categoria = Categoria;
    }
    
}
