package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdUsado extends Produto {

    // COLOURS__________________________________________________
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_RESET = "\u001B[0m";
    // _________________________________________________________

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataFabric;

    public Date getDataFabric() {
        return dataFabric;
    }

    public void setDataFabric(Date dataFabric) {
        this.dataFabric = dataFabric;
    }

    public ProdUsado() {
        super();
    }

    public ProdUsado(String nome, Double preco, Date dataFabric) {
        super(nome, preco);
        this.dataFabric = dataFabric;

    }

    @Override
    public String PriceTag() {

        return ("Nome do Produto: " + ANSI_BRIGHT_GREEN + getNome() + ANSI_RESET + "___" + "(USADO)" + "___"
                + "Preço: R$: " + ANSI_BRIGHT_GREEN + getPreco() + ANSI_RESET + "___"
                + " Data de Fabricação: " + ANSI_BRIGHT_GREEN + sdf.format(getDataFabric()) + ANSI_RESET);
    }

}
