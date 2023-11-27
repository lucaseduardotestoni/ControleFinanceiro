/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Enums.CategoriaDespesa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Neves
 */
public class DespesaTest {
    
    @Test
    public void testarToString() throws ParseException {
        // Crie uma instância da sua classe (substitua com os valores reais que você deseja testar)
        Despesa despesa = new Despesa();
        despesa.setCategoria(CategoriaDespesa.TRANSPORTE);
        despesa.setValor(500.00);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEsperada = sdf.parse("10/05/2023");
        despesa.setData(dataEsperada);
        String resultadoToString = despesa.toString();
        String resultadoEsperado = "TRANSPORTE;500.0;10/05/2023";

        assertEquals(resultadoEsperado, resultadoToString);
    }

}
