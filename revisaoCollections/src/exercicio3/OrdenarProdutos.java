package exercicio3;

import java.util.Set;
import java.util.TreeSet;

public class OrdenarProdutos {
    public static void main(String[] args) {
        Set<Produto> produtos = new TreeSet<>();

        produtos.add(new Produto("Vestido", 70.0));
        produtos.add(new Produto("Regata", 30.0));
        produtos.add(new Produto("Short", 50.0));
        produtos.add(new Produto("Calça", 80.0));
        produtos.add(new Produto("Jaqueta", 90.0));
        produtos.add(new Produto("saia", 20.0));

        for(Produto produto: produtos){
            System.out.println(produto);
        }
    }


}
