package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.Dao.Despesa;
import model.Dao.Receita;

public class ImportadorControleFinanceiro {

    private File arquivoDespesa = (new File("Dados\\Despesas.csv"));
    private File arquivoReceita = (new File("Dados\\Receita.csv"));

    public List<Despesa> processarArquivoDespesa() {
        List<Despesa> despesas = new ArrayList<Despesa>();
        try (Scanner sc = new Scanner(arquivoDespesa, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Categoria da Receita; Valor; Data	
                String[] dados = linha.split(";");

                Despesa despesa = new Despesa(CategoriaDespesa.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));

                despesas.add(despesa);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return despesas;
    }

    public List<Receita> processarArquivoReceita() {
        List<Receita> receitas = new ArrayList<Receita>();
        try (Scanner sc = new Scanner(arquivoReceita, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Salário Tech;3500;Empresa;25/03/2023
                String[] dados = linha.split(";");

                Receita receita = new Receita(CategoriaReceita.valueOf(dados[0]), Double.parseDouble(dados[1]), (new Date(dados[2])));
                receitas.add(receita);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return receitas;
    }
}
