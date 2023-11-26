
package model;

import java.util.Date;

public abstract class Lancamento implements Comparable<Lancamento> {

    protected Date data;
    protected double valor;

    public Lancamento(double valor, Date dataDespesa) {
        this.data = dataDespesa;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Lancamento l) {
        return data.compareTo(l.getData());
    }

}
