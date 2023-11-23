package Exercicios.Ex_Vendas;

import java.util.ArrayList;

public class Loja {
    
   private ArrayList produtos = new ArrayList<Produto>();

   public void addProduto(ArrayList produtos){

   }

   public void realizarVenda(ArrayList produtos){

   }
   public void listarProdutos(ArrayList produtos){
    
   }
   public void buscarProduto(ArrayList produtos){

   }

public ArrayList getProdutos() {
    return produtos;
}

public void setProdutos(ArrayList produtos) {
    if(produtos.isEmpty()){
        throw new IllegalArgumentException("Produto inválido");
    } else {
        Produto = produtos;
    }
}

}
