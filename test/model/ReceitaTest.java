/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Enums.CategoriaReceita;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Neves
 */
public class ReceitaTest {
    
     @Test
    public void testarToString() throws ParseException {
        // Crie uma instância da sua classe (substitua com os valores reais que você deseja testar)
        Receita receita = new Receita();
        receita.setCategoria(CategoriaReceita.SALARIO);
        receita.setValor(500.00);
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date dataEsperada = sdf.parse("05/10/2023");
        receita.setData(dataEsperada);
        String resultadoToString = receita.toString();
        String resultadoEsperado = "SALARIO;500.0;10/05/2023";

        assertEquals(resultadoEsperado, resultadoToString);
    }

}
