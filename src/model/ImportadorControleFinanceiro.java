package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import model.Dao.Despesa;
import model.Dao.Receita;

public class ImportadorControleFinanceiro {

    private File arquivoDespesa = (new File("Dados\\Despesas.csv"));
    private File arquivoReceita = (new File("Dados\\Receita.csv"));

    private Map<Despesa, Integer> idDespesa;
    private Map<Receita, Integer> idReceita;

    public void processarArquivoDespesa() throws FileNotFoundException {

        try (Scanner sc = new Scanner(arquivoDespesa, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            int cont = 0;

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Categoria da Receita; Valor; Data	
                String[] dados = linha.split(";");

                Despesa despesa = new Despesa((dados[0]), dados[1], (new Date(dados[2])));

                idDespesa.put(despesa, cont);
                cont++;
            }
        }
    }

    public void processarArquivoReceita() throws FileNotFoundException {

        try (Scanner sc = new Scanner(arquivoReceita, "UTF-8")) {
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            int cont = 0;
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                //Salário Tech;3500;Empresa;25/03/2023
                String[] dados = linha.split(";");

                Receita receita = new Receita((dados[0]), dados[1], (new Date(dados[2])));

                idReceita.put(receita, cont);

            }
        }
    }
    
    public void cadastrarDespesa(String linha){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDespesa, true))) {
            writer.write(linha);
            writer.newLine(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastrarReceita(String linha){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoReceita, true))) {
            writer.write(linha);
            writer.newLine(); 
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
