package application;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ProdImport;
import entities.ProdUsado;
import entities.Produto;

public class App {

    // COLOURS_____________________________________________________
    public static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
    public static final String ANSI_RESET = "\u001B[0m";
    // ____________________________________________________________

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> prods = new ArrayList<>();
        System.out.println("Número de produtos a serem registrados:");
        Integer N = sc.nextInt();

        for (int i = 0; i < N;) {
            System.out.println("PRODUTO " + (i + 1));

            System.out.println("SELECIONE UMA OPÇÃO: \n ( 1 ) Novo \n ( 2 ) Usado \n ( 3 ) Importado");
            Integer op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("NOME: ");
                    String nome = sc.next();

                    System.out.println("PREÇO: R$_");
                    Double preco = sc.nextDouble();

                    prods.add(new Produto(nome, preco));

                    break;

                case 2:

                    System.out.println("NOME: ");
                    nome = sc.next();

                    System.out.println("PREÇO: R$_");
                    preco = sc.nextDouble();

                    System.out.println("DATA FABRICAÇÃO: ");
                    Date dataFabric = sdf.parse(sc.next());

                    prods.add(new ProdUsado(nome, preco, dataFabric));
                    break;

                case 3:

                    System.out.println("NOME: ");
                    nome = sc.next();

                    System.out.println("PREÇO: R$_");
                    preco = sc.nextDouble();

                    System.out.println("Taxa Alfandegária: R$");
                    Double txAlf = sc.nextDouble();

                    // prod = new ProdImport(nome, preco, txAlf);
                    // prods.add(prod);

                    prods.add(new ProdImport(nome, preco, txAlf));
                    break;

            }
            i++;

        }
        System.out.println();
        System.out.println(ANSI_BRIGHT_BLUE + "ETIQUETAS:" + ANSI_RESET);

        for (Produto prod : prods) {
            System.out.println(prod.PriceTag());
        }

        sc.close();

    }
}
