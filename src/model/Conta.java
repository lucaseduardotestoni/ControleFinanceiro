package model;

import java.util.List;
import java.util.Date;
import model.Despesa;
import java.util.ArrayList;
import java.util.Collections;
import model.Dao.DespesaDao;
import model.Dao.ReceitaDao;
import model.Receita;

public class Conta {

    private double saldo;
    private List<ReceitaDao> receitas;
    private List<DespesaDao> despesas;
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

    public List<ReceitaDao> listarReceitas() {
        return receitas;
    }

    public List<DespesaDao> listarDespesas() {
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
        // Obtém a data atual
        Date dataAtual = new Date();

        // Somar receitas com data até hoje
        for (ReceitaDao receita : receitas) {
            if (receita.getData().before(dataAtual) || receita.getData().equals(dataAtual)) {
                saldoAtual += receita.getValor();
            }
        }
        // Subtrair despesas com data até hoje
        for (DespesaDao despesa : despesas) {
            if (despesa.getData().before(dataAtual) || despesa.getData().equals(dataAtual)) {
                saldoAtual -= despesa.getValor();
            }
        }
        return saldoAtual;
    }

    public double consultarSaldoTotal() {
        double saldoAtual = 0;

        // Somar receitas com data até hoje
        for (ReceitaDao receita : receitas) {
            saldoAtual += receita.getValor();
        }
        // Subtrair despesas com data até hoje
        for (DespesaDao despesa : despesas) {
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
