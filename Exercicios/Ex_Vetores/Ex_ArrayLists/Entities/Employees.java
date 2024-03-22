package Ex_ArrayLists.Entities;

public class Employees {

    private int id;
    private String name;
    private Double salary;

    public Employees(int i,String n,double s){
        this.setId(i);
        this.setName(n);
        this.setSalary(s);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaSalary(double porcentage){
        salary += salary * porcentage/100;
    }
    
} 
