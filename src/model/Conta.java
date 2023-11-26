package model;

import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import model.Dao.Despesa;
import model.Dao.Receita;

public class Conta {

    private double saldo;
    private List<Receita> receitas = new ArrayList<Receita>();
    private List<Despesa> despesas = new ArrayList<Despesa>();

    public Conta() {
        try{
        ImportadorControleFinanceiro importador = new ImportadorControleFinanceiro();
        importador.processarArquivoDespesa();
        importador.processarArquivoReceita();
        } catch(FileNotFoundException error){
            System.out.println("Erro");
        }
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
}
