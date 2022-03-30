package entities;

public class ProdImport extends Produto {

    // COLOURS__________________________________________________
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_RESET = "\u001B[0m";
    // _________________________________________________________

    private Double txAlf;

    private Double total;

    public Double getTxAlf() {
        return txAlf;
    }

    public Double getTotal() {
        return total;
    }

    public Double setTotal(Double total) {
        this.total = total;
        return total;
    }

    public void getTxAlf(Double txAlf) {
        this.txAlf = txAlf;
    }

    public ProdImport() {
        super();
    }

    public ProdImport(String nome, Double preco, Double txAlf) {
        super(nome, preco);
        this.txAlf = txAlf;

    }

    public Double getTxalf() {
        return txAlf;
    }

    public void setTxalf(Double txalf) {
        this.txAlf = txalf;
    }

    public Double Total(Double txAlf) {
        return getPreco() + txAlf;
    }

    @Override
    public String PriceTag() {
        return ("Nome do Produto: " + ANSI_BRIGHT_GREEN + getNome() + "___" + ANSI_RESET + "Total: R$: "
                + ANSI_BRIGHT_GREEN + Total(txAlf) +
                ANSI_RESET + "( Taxa Alfandegária: R$:" + ANSI_BRIGHT_GREEN + txAlf + ANSI_RESET);
    }

}
