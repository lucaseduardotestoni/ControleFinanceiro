package model;

import java.text.SimpleDateFormat;
import model.CategoriaDespesa;
import java.util.Date;

public class Despesa {
    
    private CategoriaDespesa categoria;
    private double valor;
    private Date data;

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
