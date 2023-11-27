/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import model.Enums.CategoriaDespesa;
import model.Enums.CategoriaReceita;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Neves
 */
public class ContaTest {
    
    Conta conta;
    
    @Before
    public void inicializarContexto(){
        conta = new Conta();
    }
    
    @Test
    public void listarDespesas(){
        List<Despesa> despesas = conta.listarDespesas();
        assertNotNull(despesas);
    }
    
    @Test
    public void listarReceitas(){
        List<Receita> receitas = conta.listarReceitas();
        assertNotNull(receitas);
    }
    
    @Test
    public void listarLancamentos(){
        List<Lancamento> lancamentos = conta.listarLancamentos();
        assertNotNull(lancamentos);
    }
    
    @Test
    public void consultarSaldoAtual(){
        Conta conta = new Conta();
        LocalDate dataAtual = LocalDate.now();
        Date dataAtualComoDate = java.sql.Date.valueOf(dataAtual);
        
        Despesa despesa = new Despesa();
        despesa.setCategoria(CategoriaDespesa.TRANSPORTE);
        despesa.setData(dataAtualComoDate);
        despesa.setValor(10);
        conta.cadastrarDespesa(despesa);
        
        Receita receita = new Receita();
        receita.setCategoria(CategoriaReceita.SALARIO);
        receita.setData(dataAtualComoDate);
        receita.setValor(10);
        conta.cadastrarReceita(receita);
        
        assertEquals(0, conta.consultarSaldoAtual(), 0.001); // Usando delta para lidar com comparação de números de ponto flutuante
    }
    
    @Test
    public void consultarSaldoTotal(){
        Conta conta = new Conta();
        LocalDate dataAtual = LocalDate.now();
        Date dataAtualComoDate = java.sql.Date.valueOf(dataAtual);
        
        Despesa despesa = new Despesa();
        despesa.setCategoria(CategoriaDespesa.TRANSPORTE);
        despesa.setData(dataAtualComoDate);
        despesa.setValor(10);
        conta.cadastrarDespesa(despesa);
        
        Receita receita = new Receita();
        receita.setCategoria(CategoriaReceita.SALARIO);
        receita.setData(dataAtualComoDate);
        receita.setValor(10);
        conta.cadastrarReceita(receita);
        
        assertEquals(0, conta.consultarSaldoTotal(), 0.001); // Usando delta para lidar com comparação de números de ponto flutuante
    }
    
    @Test
    public void cadastrarDespesa(){
        Conta conta = new Conta();
        LocalDate dataAtual = LocalDate.now();
        Date dataAtualComoDate = java.sql.Date.valueOf(dataAtual);
        
        Despesa despesa = new Despesa();
        despesa.setCategoria(CategoriaDespesa.TRANSPORTE);
        despesa.setData(dataAtualComoDate);
        despesa.setValor(10);
        conta.cadastrarDespesa(despesa);
        
        assertNotNull(conta.listarDespesas());
    }
    
    
    
}
