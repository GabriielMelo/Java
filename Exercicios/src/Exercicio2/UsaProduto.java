/*
Crie uma classe Produto que represente um produto em uma loja. A classe deve ter atributos como nome,
preço e quantidade em estoque, além de métodos para atualizar o estoque e calcular o valor total.
 */
package Exercicio2;
public class UsaProduto {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Garrafa",25.0f,15);
        
        System.out.println(p1.toString());
        p1.adicionarEstoque();
        System.out.println(p1.toString());
        p1.removerEstoque();
        System.out.println(p1.toString());
        p1.calcValor();
        
        
        
    }
}
