public abstract class Trabalhador{

private String nome;
private double salario;

//Constructors
public Trabalhador(){

}
public Trabalhador(String n,double s){
    this.setNome(n);
    this.setSalario(s);
}

// Getters and Setters
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    if(nome.isEmpty()){
        throw new IllegalArgumentException("Nome inválido");
    } else {
        this.nome = nome;
    }
   
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    if(salario == 0){
       throw new IllegalArgumentException("Salário inválido");
    } else {
    this.salario = salario;
    }
    
}

// abstract method
public abstract void calcularSalario();

}