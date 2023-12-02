import java.util.Scanner;


public class ExNegativos {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n=0;
        do{
            System.out.println("Quantos numeros deseja inserir? ( máximo 10)");
             n = sc.nextInt();
             if(n<=0|| n>10){
                System.out.println("Numero inválido!");
             }

        } while(n<=0|| n>10);

            int[] vect = new int[n];
            int i=0;
            for(i=0;i<n;i++){
                System.out.println("Digite um numero: ");
                vect[i] = sc.nextInt();
            } 
            System.out.println("Numeros Negativos: ");
            for(i=0;i<n;i++){
                if(vect[i]<0){
                    System.out.println(vect[i]);
                }
            }
        

        sc.close();


    }

}