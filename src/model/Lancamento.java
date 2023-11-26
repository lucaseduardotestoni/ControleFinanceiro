/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Lucas.Testoni
 */
public abstract class Lancamento implements Comparable<Lancamento> {

    private Date data;
    private double valor;

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
