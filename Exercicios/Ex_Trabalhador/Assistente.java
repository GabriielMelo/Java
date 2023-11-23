public class Assistente extends Trabalhador implements Calculavel{

    
    public Assistente(String n, double s){
        super(n,s);
    }

    public void calcularSalario() {
        double aux_salario = getSalario() + this.calcularBonificacao(getSalario());
        setSalario(aux_salario);
    }

    public double calcularBonificacao(double salario) {
        double bonus = salario * 0.03;
        return bonus;
    }
    
}
