package model.Dao;

import java.util.Date;
import model.CategoriaDespesa;
import model.CategoriaReceita;
import model.Lancamento;

public class Receita extends Lancamento {

    private CategoriaReceita Categoria;

    public Receita(CategoriaReceita categoria, double valor,Date dataReceita) {
        super(valor, dataReceita);
        this.Categoria = categoria;
    }

    public void setCategoria(CategoriaReceita Categoria) {
        this.Categoria = Categoria;
    }
    
}
