package exercicio3;

public class Produto implements Comparable<Produto>{
    private String nome;
    private  Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.compare(this.preco, produto.preco);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
