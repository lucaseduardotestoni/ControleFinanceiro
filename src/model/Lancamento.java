package model;

import java.util.Date;

/**
 * Classe pai que irá ter as caracteristicas de lancamentos
 * */
public abstract class Lancamento implements Comparable<Lancamento> {

    protected Date data;
    protected double valor;

    public Lancamento() {

    }

    public Lancamento(double valor, Date data) {
        this.data = data;
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
