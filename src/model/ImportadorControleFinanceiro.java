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
import model.Dao.DespesaDao;
import model.Dao.ReceitaDao;

public class ImportadorControleFinanceiro {

    private File arquivoDespesa = (new File("Dados\\Despesas.csv"));
    private File arquivoReceita = (new File("Dados\\Receita.csv"));

    public List<DespesaDao> processarArquivoDespesa() {
        List<DespesaDao> despesas = new ArrayList<>();
        try (Scanner sc = new Scanner(arquivoDespesa, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Categoria da Receita; Valor; Data	
                String[] dados = linha.split(";");

                DespesaDao despesa = new DespesaDao(CategoriaDespesa.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));
                System.out.println(despesa);
                despesas.add(despesa);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return despesas;
    }

    public List<ReceitaDao> processarArquivoReceita() {
        List<ReceitaDao> receitas = new ArrayList<>();
        try (Scanner sc = new Scanner(arquivoReceita, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Salário Tech;3500;Empresa;25/03/2023
                String[] dados = linha.split(";");

                ReceitaDao receita = new ReceitaDao(CategoriaReceita.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));
                
                receitas.add(receita);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return receitas;
    }

    public void cadastrarDespesa(String linha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDespesa, true))) {
            writer.newLine();
            writer.write(linha);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarReceita(String linha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoReceita, true))) {
            writer.newLine();
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
