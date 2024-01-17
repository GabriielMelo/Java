public class Boleto {

    private String numero;
    private String banco;
    private Double valorTotal;
    private Double porcentagemMulta;
    private Double porcentagemJurosDia;

    public Boleto(String n, String b, Double vt, Double pm, Double pjd) {
        this.setNumero(n);
        this.setBanco(b);
        this.setValorTotal(vt);
        this.setPorcentagemMulta(pm);
        this.setPorcentagemJurosDia(pjd);
    }

    public void aplicaDesconto(Double valor) {
        this.setValorTotal(this.getValorTotal() - valor);
    }

    public Double calculaValorMulta() {
        Double valorMulta = this.getValorTotal() * (this.getPorcentagemMulta() / 100);
        return valorMulta;
    }

    public Double calculaValorJuros(int dia) {
        Double jurosDia = (this.getPorcentagemJurosDia() / 100) * dia;
        jurosDia *= this.getValorTotal();
        return jurosDia;
    }

    public Double calculaValor(int dia) {
        Double jurosDia = calculaValorJuros(dia);
        Double valorTotal = this.getValorTotal() + this.getPorcentagemMulta() + jurosDia;
        return valorTotal;
    }

    public String menorBoleto(Boleto b) {
        if (this.getPorcentagemJurosDia() < b.getPorcentagemJurosDia()) {
            return this.getBanco();
        } else if (this.getPorcentagemJurosDia() > b.getPorcentagemJurosDia()) {
            return b.getBanco();
        } else {
            return this.getBanco();
        }
    }

    public String menorBoleto(Double valor, Boleto b){
        if(this.getValorTotal()<valor && b.getValorTotal()>valor){
            return this.getBanco();
        } else if(this.getValorTotal()>valor && b.getValorTotal()<valor){
            return b.getBanco();
        } else {
            return this.getBanco();
        }
    }

    public void imprimir(){
        System.out.printf("Numero do boleto: " + this.getNumero() + 
        "\nBanco: " + this.getBanco()+ 
        "\nMulta dias de atraso : " + String.format("%.2f",this.getPorcentagemJurosDia()) + 
        "\nMulta: " + String.format("%.2f",this.getPorcentagemMulta()) + 
        "\nValor Total: " + String.format("%.2f",getValorTotal())
        );
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getPorcentagemMulta() {
        return porcentagemMulta;
    }

    public void setPorcentagemMulta(Double porcentagemMulta) {
        this.porcentagemMulta = porcentagemMulta;
    }

    public Double getPorcentagemJurosDia() {
        return porcentagemJurosDia;
    }

    public void setPorcentagemJurosDia(Double porcentagemJurosDia) {
        this.porcentagemJurosDia = porcentagemJurosDia;
    }

}
