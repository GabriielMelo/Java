// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor 
import java.util.Scanner;

public class SomaVetor{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Quantos numeros deseja inserir?");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("Numero inválido!");
            }
        } while(n<=0);

        double vect[] = new double[n];
        int i = 0;
        double soma = 0;
        double media = 0;
        for(i=0;i<n;i++){
            System.out.println("Digite um numero");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma/n;
        System.out.println("Valores : ");
        for(i=0;i<n;i++){
            System.out.printf( "%.1f ",vect[i]);
        }
        System.out.printf("\nSoma = %.2f", soma);
        System.out.printf("\nMédia = %.2f",media);   
        sc.close();
    }
       
}