package entidades;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Produto> produtos;

    public CarrinhoDeCompra() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerUltimoProduto() {
        if (!produtos.isEmpty()) {
            produtos.remove(produtos.size() - 1);
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }
}