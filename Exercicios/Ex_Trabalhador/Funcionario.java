public class Funcionario extends Trabalhador {

    // Constructor
    public Funcionario(String n,double s){
        super(n,s);
    }
    // implemented method
    public void calcularSalario() {
      this.setSalario(getSalario()+(getSalario()*0.05));
    }
    
}
