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

    /**
    Import a classe importador e inicializa importação dos dados dos Arquivos CSV
    */
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
    /**
     * lista as receitas atráves de uma list da classe receita
     *
     */
    public List<Receita> listarReceitas() {
        return receitas;
    }
    /**
     * lista as despesas atráves de uma list da classe Despesa
     */
    public List<Despesa> listarDespesas() {
        return despesas;
    }
    /**
     *  Irá percorrer todos os lancamentos de despesas e receitas
     *  e irá retornar eles de acordo com a data em forma decrescente
     */
    public List<Lancamento> listarLancamentos() {
        List<Lancamento> lancamentos = new ArrayList<>();
        lancamentos.addAll(receitas);
        lancamentos.addAll(despesas);
        Collections.sort(lancamentos, Collections.reverseOrder());
        return lancamentos;
    }
    /**
     * Consulta o saldo atual a partir da data do computador irá fazer uma
     * pesquisa de todos os lançamentos feitos anteriormente aquela data
     * em seguida irá capturar o valor deles armazenar e subtrarir com saldo atual da receita
     * saldo atual da despesa
     * */
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
    /**
     * Percorre todas as receitas e capturar o valor e soma
     * em seguida percorre todas as despesas e pega saldo atual e subtrai com elas
     * */
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
    /**
     * Passa os valores de despesa, assim ele chama uma classe de cadastro
     * de dados, a partir de um metodo toString
     */
    public void cadastrarDespesa(Despesa despesa) {
        importador.cadastrarDespesa(despesa.toString());
    }
    /**
     * Passa os valores de Receita, assim ele chama uma classe de cadastro
     * de dados, a partir de um metodo toString
     */
    public void cadastrarReceita(Receita receita) {
        importador.cadastrarReceita(receita.toString());
    }
}
