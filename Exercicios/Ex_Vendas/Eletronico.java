package Exercicios.Ex_Vendas;

public class Eletronico extends Produto {

    private String garantia;

    public Eletronico(int cp,String n,double p,int qt,String g){
        super(cp,n,p,qt);
        setGarantia(g);
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        if(garantia.isEmpty()){
            throw new IllegalArgumentException("Garantia inválida!");
        } else {
            this.garantia = garantia;
        }
    }

    
    
}
