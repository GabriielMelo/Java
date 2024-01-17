public abstract class ProdutoEletronico{

    private String nome;
    private double preco;
    private String marca;
    private double armazenamento;
    private String processador;
    
    public ProdutoEletronico(){
    }

    public ProdutoEletronico(String n,double p, String m,double a,String pc){
        this.setNome(n);
        this.setPreco(p);
        this.setMarca(m);
        this.setArmazenamento(a);
        this.setProcessador(pc);
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     
}