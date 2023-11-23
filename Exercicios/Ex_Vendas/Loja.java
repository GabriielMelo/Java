import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void realizarVenda(Venda venda) {
        for (Produto produtoVendido : venda.getProdutos()) {
            if (estoque.contains(produtoVendido)) {
                estoque.remove(produtoVendido);
            } else {
                throw new IllegalArgumentException("Produto não disponível no estoque: " + produtoVendido.getNome());
            }
        }
    }

    public void listarProdutosDisponiveis() {
        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
    }

    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo_produto() == codigo) {
                return produto;
            }
        }
        return null;
    }
}