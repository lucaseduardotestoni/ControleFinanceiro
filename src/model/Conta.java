package model;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;

public class Conta {

    private double saldo;
    private List<Receita> receitas;
    private List<Despesa> despesas;
    ImportadorControleFinanceiro importador;

    public Conta() {
        importador = new ImportadorControleFinanceiro();
        despesas = importador.processarArquivoDespesa();
        receitas = importador.processarArquivoReceita();
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
        Collections.sort(lancamentos, Collections.reverseOrder());
        return lancamentos;
    }

    public double consultarSaldoAtual() {
        double saldoAtual = 0;

        Date dataAtual = new Date();

        
        for (Receita receita : receitas) {
            if (receita.getData().before(dataAtual) || receita.getData().equals(dataAtual)) {
                saldoAtual += receita.getValor();
            }
        }
        
        for (Despesa despesa : despesas) {
            if (despesa.getData().before(dataAtual) || despesa.getData().equals(dataAtual)) {
                saldoAtual -= despesa.getValor();
            }
        }
        return saldoAtual;
    }

    public double consultarSaldoTotal() {
        double saldoAtual = 0;

        for (Receita receita : receitas) {
            saldoAtual += receita.getValor();
        }

        for (Despesa despesa : despesas) {
            saldoAtual -= despesa.getValor();
        }
        return saldoAtual;
    }

    public void cadastrarDespesa(Despesa despesa) {
        importador.cadastrarDespesa(despesa.toString());
    }

    public void cadastrarReceita(Receita receita) {
        importador.cadastrarReceita(receita.toString());
    }
}
