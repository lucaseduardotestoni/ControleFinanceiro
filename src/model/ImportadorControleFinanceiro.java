package model;

import model.Enums.CategoriaDespesa;
import model.Enums.CategoriaReceita;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 * Classe que manipula os dados de despesas e receitas*/
public class ImportadorControleFinanceiro {

    /**
    * Declara e inicia variavel com caminho do arquivo despesa.csv
     * */
    private File arquivoDespesa = (new File("Dados\\Despesas.csv"));
    /**
     * Declara e inicia variavel com caminho do arquivo Receita.csv
     * */
    private File arquivoReceita = (new File("Dados\\Receita.csv"));

    /**
     * Metodo que irá processar o arquivo Despesa seguindo o padrao
     * de dados irá separar em um array os dados em seguida armazena na Classe Despesa
     * e retorna os dados com todas as Despesas Cadastradas
     * */
    public List<Despesa> processarArquivoDespesa() {
        List<Despesa> despesas = new ArrayList<>();
        try (Scanner sc = new Scanner(arquivoDespesa, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
	
                String[] dados = linha.split(";");

                Despesa despesa = new Despesa(CategoriaDespesa.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));

                despesas.add(despesa);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return despesas;
    }
    /**
     * Metodo que irá processar o arquivo Receita seguindo o padrão
     * de dados irá separar em um array os dados em seguida armazena na Classe Despesa
     * e retorna os dados com todas as Receitas Cadastradas
     * */
    public List<Receita> processarArquivoReceita() {
        List<Receita> receitas = new ArrayList<>();
        try (Scanner sc = new Scanner(arquivoReceita, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                String[] dados = linha.split(";");

                Receita receita = new Receita(CategoriaReceita.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));

                receitas.add(receita);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return receitas;
    }
    /**
     * irá receber os dados processados pelo metodo toString Despesa
     * prepara para adicionar os dados no arquivo em uma linha unica*/
    public void cadastrarDespesa(String linha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDespesa, true))) {
            writer.write(linha);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * irá receber os dados processados pelo metodo toString Receita
     * prepara para adicionar os dados no arquivo em uma linha unica*/
    public void cadastrarReceita(String linha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoReceita, true))) {
            writer.write(linha);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getArquivoDespesa() {
        return arquivoDespesa;
    }

    public File getArquivoReceita() {
        return arquivoReceita;
    }

}
