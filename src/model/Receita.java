/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import model.CategoriaReceita;
import java.util.Date;

/**
 *
 * @author Neves
 */
public class Receita {
    
    private CategoriaReceita categoria;
    private Date data;
    private double valor;

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(categoria).append(";");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(sdf.format(data)).append(";");
        
        // Adicionando o valor
        sb.append(valor).append(";");

        return sb.toString();
    }
}
