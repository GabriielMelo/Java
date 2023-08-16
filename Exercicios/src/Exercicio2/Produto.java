/*
Exercício 2: Classe de Produto
Crie uma classe Produto que represente um produto em uma loja. A classe deve ter atributos como nome,
preço e quantidade em estoque, além de métodos para atualizar o estoque e calcular o valor total.
 */
package Exercicio2;

import java.util.Scanner;

public class Produto {

    public String nome;
    public Float preco;
    public int qtEstoque;
    Scanner scan = new Scanner(System.in);

    public Produto(String nome, Float preco, int qtEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtEstoque = qtEstoque;
    }
    
    public String toString(){
        return "Produto : " + nome + "\nPreço: " + preco + "\nQuantidade em estoque: " + qtEstoque;
    }

    public void adicionarEstoque() {
        int qt;
        System.out.println("Digite a quantidade a ser adicionada:");
        qt = scan.nextInt();
        if (qt <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            qtEstoque += qt;
        }
    }

    public void removerEstoque() {
        int qt;
        System.out.println("Digite a quantidade a ser removida:");
        qt = scan.nextInt();
        if (qt <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            qtEstoque -= qt;
        }
    }
    public void calcValor(){
        this.toString();
        System.out.println("Valor total de mercadorias : "+ qtEstoque * preco);
    }
}
