package model;

import java.text.SimpleDateFormat;
import model.Enums.CategoriaDespesa;
import java.util.Date;

public class Despesa extends Lancamento {

    private CategoriaDespesa categoria;

    public Despesa() {

    }

    public Despesa(CategoriaDespesa categoria, double valor, Date data) {
        super(valor, data);
        this.categoria = categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(categoria).append(";");

        sb.append(valor).append(";");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(sdf.format(data)).append(";");

        return sb.toString();
    }
}
