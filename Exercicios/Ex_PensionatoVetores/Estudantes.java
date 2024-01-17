package Ex_PensionatoVetores;
import java.util.Scanner;
public class Estudantes {
    public String nome;
    public String email;

    public Estudantes(){}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n< 1 || n>10){
            System.out.println("Quantos estudantes irão se hospedar?");
            n = sc.nextInt();
            if(n< 1 || n>10){
                System.out.println("Numero inválido de estudantes");
            }
        }

        sc.nextLine();

        Estudantes[] vect = new Estudantes[10];

        for(int i=0;i<n;i++){
            int aux = 1;
            aux+=i;
            int nQuarto = 0;
            System.out.println("Selecione um quarto de 1 a 10");
            nQuarto = sc.nextInt();
            while(nQuarto < 1 || nQuarto > 10 && vect[nQuarto - 1] != null){
                System.out.println("Quarto inválido! \nSelecione um quarto de 1 a 10");
                nQuarto = sc.nextInt();
            }
             vect[nQuarto - 1] = new Estudantes();
            System.out.println("Digite o nome do " + aux + "° estudante : ");
            vect[nQuarto].nome = sc.next();
            System.out.println("Digite o e-mail do estudante : ");
            vect[nQuarto].email = sc.next();
            sc.nextLine();
        }
        System.out.println("Quartos ocupados : ");
        for(int i=0;i<n;i++){
            if(vect[i] != null){
                System.out.println( i + ": Estudante : " + vect[i].nome);
                System.out.println("\nE-mail : " + vect[i].email);
                System.out.println("\n---------------------");
            } else {
                continue;
            }
        }
        sc.close();
    }
    
    



}
