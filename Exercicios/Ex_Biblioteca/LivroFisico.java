public class LivroFisico extends Livro {


    private int numPaginas;

    public LivroFisico(String t, String a, int ap, boolean d, int np){
        super(t,a,ap,d);
        setNumPaginas(np);
    }
    
    public void emprestar() {
       if(this.isDisponivel()){
            setDisponivel(false);
       } else {
            throw new IllegalArgumentException("Livro indis´pnível");
       }
    }

    public void devolver() {
        if(!this.isDisponivel()){
            setDisponivel(true);
        } else {
            throw new IllegalArgumentException("Livro já devolvido");
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }


    public void setNumPaginas(int numPaginas) {
        if(numPaginas <=0){
            throw new IllegalArgumentException("Numero de páginas inválido");
        } else{
            this.numPaginas = numPaginas;
        }
    }
    
}
