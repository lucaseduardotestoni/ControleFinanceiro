/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Neves
 */
public class importadorControleFinanceiroTest {
    
    ImportadorControleFinanceiro importador;
    
    @Before
    public void inicializaContexto(){
        importador = new ImportadorControleFinanceiro();
    }
    
    @Test
    public void processaArquivoDespesa(){
        assertNotNull(importador.processarArquivoDespesa());
    }
    
    @Test
    public void processaArquivoReceita(){
        assertNotNull(importador.processarArquivoReceita());
    }
    
    @Test
    public void cadastrarDespesa(){
        String linha = "TRANSPORTE;500.00;10/05/2023";
        importador.cadastrarDespesa(linha);
        
        Conta conta = new Conta();
        assertNotNull(conta.listarDespesas());
    }
    
    @Test
    public void cadastrarReceita(){
        String linha = "SALARIO;500.00;10/05/2023";
        importador.cadastrarReceita(linha);
        
        Conta conta = new Conta();
        assertNotNull(conta.listarReceitas());
    }
    
}
