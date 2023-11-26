package model;

import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Despesa;
import java.util.ArrayList;
import java.util.Collections;
import model.Receita;
import model.Dao.DespesaDao;
import model.Dao.ReceitaDao;

public class Conta {

    private double saldo;
    private List<Receita> receitas = new ArrayList<ReceitaDao>();
    private List<Despesa> despesas = new ArrayList<DespesaDao>();
    ImportadorControleFinanceiro importador;
    
    public Conta() {
        importador = new ImportadorControleFinanceiro();
        importador.processarArquivoDespesa();
        importador.processarArquivoReceita();

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Receita> listarReceitas() {
        return receitas;
    }

    public List<Despesa> listarDespesas() {
        return despesas;
    }

    public List<Lancamento> listarLancamentos() {
        List<Lancamento> lancamentos = new ArrayList<>();
        lancamentos.addAll(receitas);
        lancamentos.addAll(despesas);
        Collections.sort(lancamentos);
        return lancamentos;
    }
    
    public void cadastrarDespesa(Despesa despesa){
        importador.cadastrarDespesa(despesa.toString());
    }
    
    public void cadastrarReceita(Receita receita){
        importador.cadastrarReceita(receita.toString());
    }
}
