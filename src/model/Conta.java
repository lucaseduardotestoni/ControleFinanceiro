
package model;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Despesa;

public class Conta {
    private double saldo;
    private Map<Receita, Integer> receitas;
    private Map<Despesa, Integer> despesa;
    ImportadorControleFinanceiro importador;
    
    public Conta (){
        try {
            importador = new ImportadorControleFinanceiro();
            importador.processarArquivoDespesa();
            importador.processarArquivoReceita();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Map<Receita, Integer> listarReceitas() {
        return receitas;
    }

    public Map<Despesa, Integer> listarDespesas() {
        return despesa;
    }
    
    public ArrayList<> listarLancamentos() {
        
        return despesa;
    }
    
    public void cadastrarDespesa(Despesa despesa){
        importador.cadastrarDespesa(despesa.toString());
    }
    
    public void cadastrarReceita(Receita receita){
        importador.cadastrarReceita(receita.toString());
    }
    
}
