public abstract class Livro implements Emprestavel {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String t, String a , int ap, boolean d){
        setTitulo(t);
        setAutor(a);
        setAnoPublicacao(ap);
        setDisponivel(d);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.isEmpty()){
            throw new IllegalArgumentException("Titulo inválido!");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.isEmpty()){
            throw new IllegalArgumentException("Nome do autor inválido!");
        } else{
            this.autor = autor;
        }
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao <= 1000){
            throw new IllegalArgumentException("Ano de publicação inválido");
        } else {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    

}