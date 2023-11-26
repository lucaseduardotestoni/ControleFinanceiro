/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.Dao.Despesa;
import model.Dao.Receita;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas.Testoni
 */
public class ContaTest {
    
    public ContaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSaldo method, of class Conta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Conta instance = new Conta();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Conta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        Conta instance = new Conta();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarReceitas method, of class Conta.
     */
    @Test
    public void testListarReceitas() {
        System.out.println("listarReceitas");
        Conta instance = new Conta();
        List<Receita> expResult = null;
        List<Receita> result = instance.listarReceitas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarDespesas method, of class Conta.
     */
    @Test
    public void testListarDespesas() {
        System.out.println("listarDespesas");
        Conta instance = new Conta();
        List<Despesa> expResult = null;
        List<Despesa> result = instance.listarDespesas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLancamentos method, of class Conta.
     */
    @Test
    public void testListarLancamentos() {
        System.out.println("listarLancamentos");
        Conta instance = new Conta();
        List<Lancamento> expResult = null;
        List<Lancamento> result = instance.listarLancamentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
