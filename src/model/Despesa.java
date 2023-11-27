package model;

import java.text.SimpleDateFormat;
import model.Enums.CategoriaDespesa;
import java.util.Date;
/**
 * Extensao da Classe laçamento que contem todas informações
 * da Despesa*/
public class Despesa extends Lancamento {

    private CategoriaDespesa categoria;

    public Despesa() {

    }
    public Despesa(CategoriaDespesa categoria, double valor, Date data) {
        super(valor, data);
        this.categoria = categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    /**
     * Metodo toString de Cadastro de Despesa, chama String Builder
     * preparando os dados capturados do usuário para gravar.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(categoria).append(";");

        sb.append(valor).append(";");
        System.out.println(data);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(sdf.format(data));

        return sb.toString();
    }
}
