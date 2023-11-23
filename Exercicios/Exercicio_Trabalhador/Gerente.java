public class Gerente extends Trabalhador implements Calculavel{

    private String departamento ;

    public Gerente(String n, double s, String d){
        super(n,s);
        this.departamento = d;

    }

    // Getters and Setters;
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        if(departamento.isEmpty()) {
            throw new IllegalArgumentException("Departamento inválido");
        } else {
            this.departamento = departamento;
        }
    }
    
    // implemented method
    public void calcularSalario() {
        double aux_salario = getSalario() + this.calcularBonificacao(getSalario());
        setSalario(aux_salario);
    }
    // implemented interface
    public double calcularBonificacao(double salario) {
      double bonus = salario * 0.10;
      return bonus;
    }

}
