package entities;

import java.util.List;

public class Produto {

    // COLOURS__________________________________________________
    public static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
    public static final String ANSI_RESET = "\u001B[0m";
    // _________________________________________________________

    private String nome;

    private Double preco;

    private List<Produto> prods;

    public String getNome() {
        return nome;
    }

    public List<Produto> getProds() {
        return prods;
    }

    public void setProds(List<Produto> prods) {
        this.prods = prods;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto() {
        super();
    }

    public Produto(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String PriceTag() {

        return ("Nome do Produto: " + ANSI_BRIGHT_GREEN + nome + ANSI_RESET + "___" + "Preço: R$: " + ANSI_BRIGHT_GREEN
                + preco + ANSI_RESET);
    }

}
