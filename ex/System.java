package ex;

import ex.Lote;
import ex.Produto;

public class System {

    public static void main(String[] args) {

        Produto produto = new Produto("Leite", "Parmalat");
        Lote lote = new Lote(produto, 10L);
    }
}