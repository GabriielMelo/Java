import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws ParseException{
    

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter department's name");
        String department = sc.nextLine();
        System.out.print("Enter Worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Worker Level:");
        String level = sc.nextLine();
        System.out.print("Worker Salary:");
        Double salary = sc.nextDouble();
        // Instanciando um novo objeto do tipo worker, passando como parâmetro o nome, WorkerLevel,salario e como o contrutor aceita um objeto do tipo Department, instanciamos um novo objeto passando a variavel department como parâmetro.
        Worker worker = new Worker(name,WorkerLevel.valueOf(level),salary,new Department(department));

        System.out.print("How many contracts for this worker?");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date DD/MM/YYYY");
            Date contractDate = sdf.parse(sc.next()); 
            System.out.print("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours)");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income(MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();

    }
}
