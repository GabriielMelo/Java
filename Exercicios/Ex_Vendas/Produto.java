package Exercicios.Ex_Vendas;

public abstract class Produto {
    
    private int codigo_produto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int cp,String n,double p,int qt){
        setCodigo_produto(cp);
        setNome(n);
        setPreco(p);
        setQuantidade(qt);
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }
    public void setCodigo_produto(int codigo_produto) {
        if(codigo_produto <0){
            throw new IllegalArgumentException("Código do produto inválido");
        } else {
            this.codigo_produto = codigo_produto;
        }
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("Nome do produto inválido");
        } else {
            this.nome = nome;
        }
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if(preco <=0){
            throw new IllegalArgumentException("Valor do produto inválido");
        } else {
            this.preco = preco;
        }
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        if(quantidade <=0){
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade = quantidade;
    }

}
