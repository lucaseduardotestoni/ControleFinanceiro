package model;

import java.text.SimpleDateFormat;
import model.Enums.CategoriaReceita;
import java.util.Date;

public class Receita extends Lancamento {

    private CategoriaReceita categoria;

    public Receita() {

    }

    public Receita(CategoriaReceita categoria, double valor, Date dataDespesa) {
        super(valor, dataDespesa);
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(categoria).append(";");

        sb.append(valor).append(";");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(sdf.format(data));

        return sb.toString();
    }
}
