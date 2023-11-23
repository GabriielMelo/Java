public class LivroDigital extends Livro{

    private double tamanhoMB;


    public LivroDigital(String t, String a, int ap, boolean d, double tmb){
        super(t, a, ap, d);
        setTamanhoMB(tmb);
    }

    public void emprestar() {
        if(this.isDisponivel()){
            setDisponivel(false);
        } else {
            throw new IllegalArgumentException("Livro Indisponível");
        }
    }

    public void devolver() {
        if(!this.isDisponivel()) {
            setDisponivel(true);
        } else {
            throw new IllegalArgumentException("Livro Já disponível");
        }
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }

    public void setTamanhoMB(double tamanhoMB) {
        if(tamanhoMB <=0){
            throw new IllegalArgumentException("Tamanho de livro inválido");
        } else {
            this.tamanhoMB = tamanhoMB;
        }
    }
    
}
