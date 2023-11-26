
package model;

import java.io.FileNotFoundException;
import java.util.Map;
import model.Dao.Despesa;
import model.Dao.Receita;


public class Conta {
    private double saldo;
    private Map<Receita, Integer> receitas;
    private Map<Despesa, Integer> despesa;
    
    public Conta () throws FileNotFoundException{
      ImportadorControleFinanceiro importador = new ImportadorControleFinanceiro();
      importador.processarArquivoDespesa();
      importador.processarArquivoReceita();
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
    
}
