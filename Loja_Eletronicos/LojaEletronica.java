import java.util.ArrayList;


public class LojaEletronica extends ProdutoEletronico{

ArrayList<ProdutoEletronico> estoque;

public LojaEletronica(){
    this.estoque = new ArrayList<>();
}

public void addEstoque(ProdutoEletronico produto){
    estoque.add(produto);
    System.out.println("Produto : "  + produto.getNome() + "Adicionado com sucesso!");
    
}

public void exibirProdutos(){
    System.out.println("Produtos em estoque : ");
    for(ProdutoEletronico produto: estoque){
        System.out.println(produto.toString());
    }
}

public void realizarVenda(ProdutoEletronico produto){
    if(estoque.contains(produto)){
        estoque.remove(produto);
        System.out.println("Venda realizada com sucesso!");
    }   else {
        System.out.println("Produto indisponível");
    }

}




}
