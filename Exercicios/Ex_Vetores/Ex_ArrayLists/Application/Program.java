package Ex_ArrayLists.Application;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n<=0){
            System.out.println("How many employees will recive salary increase?");
            n = sc.nextInt();
            if(n<=0){
                      System.out.println("Invalid number of employees! \nTry Again");
                      n= sc.nextInt();
            }
        }

    }
    public static boolean hasId(List<Employee> list,int id){
        
    }
}
