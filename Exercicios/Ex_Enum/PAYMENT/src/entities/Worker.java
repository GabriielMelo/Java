package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.WorkerLevel;



public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Remover o setContracts, pois ele irá criar novas listas e os metodos de
    // adicionar e remover
    // irão funcionar relacionados a lista já criada

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        // declaração de variavel local para efetuar a calculo do salario junto aos contratos.
        double sum = baseSalary;
        // Declaração e instanciação da Classe Calendar para comparar data do contrato a 
        //data a ser incluída nos pagamentos
        Calendar cal = Calendar.getInstance();
        // Loop para efetuar soma dos contratos da data solicitada ao valor do salário base
        for (HourContract c : contracts) {
            
            cal.setTime(c.getDate());
           
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // SOMA + 1 DEVIDO CALENDAR INICIAR COM 0 E IR ATÉ 11
            
            if(c_year == year && c_month == month){
                sum+= c.totalValue();
            }
        }
        return sum;
    }
}