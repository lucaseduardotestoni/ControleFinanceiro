package model.Dao;

import java.util.Date;
import model.Enums.CategoriaReceita;
import model.Lancamento;

public class ReceitaDao extends Lancamento {

    private CategoriaReceita Categoria;

    public ReceitaDao(CategoriaReceita categoria, double valor, Date dataReceita) {
        super(valor, dataReceita);
        this.Categoria = categoria;
    }

    public void setCategoria(CategoriaReceita Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Receita{" + "Categoria=" + Categoria + ", data=" + data + ", valor=" + valor + "}\n";
    }

}
