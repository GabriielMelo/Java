package Exercicios.Ex_Vendas;

public class Livro extends Produto{
    
    private String autor;

    public Livro(int cp,String n,double p,int qt,String a){
        super(cp, n, p, qt);
        setAutor(a);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.isEmpty()){
            throw new IllegalArgumentException("Autor inválido");
        } else {
            this.autor = autor;
        }
    }

    
    
}
