/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Dao;

import java.util.Date;
import model.CategoriaDespesa;
import model.Lancamento;

/**
 *
 * @author Lucas.Testoni
 */
public class Despesa extends Lancamento {

    private CategoriaDespesa Categoria;

    public Despesa(CategoriaDespesa categoria, double valor, Date dataDespesa) {
        super(valor, dataDespesa);
        this.Categoria = categoria;
    }

    public void setCategoria(CategoriaDespesa Categoria) {
        this.Categoria = Categoria;
    }

}
