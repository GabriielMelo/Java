package Ex_Vetores7;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 

public class AbaixoMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.println("Quantos numeros serão inseridos?");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Numero inválido");
            }
        }
        double[] vect = new double[n];
        double media = 0;
        for(int i=0;i<n;i++){
            System.out.println("Digite o numero : ");
            vect[i] = sc.nextDouble();
            media += vect[i];
        }
        media = media/n;
        System.out.println("----------------");
        System.out.printf("Média do Vetor : " + "%.3f", media);
        System.out.println("\n----------------");
        System.out.println("Elementos abaixo da média : ");
        for(int i = 0;i<n;i++){
            if(vect[i]< media){
                System.out.println(vect[i]);
            } else {
                continue;
            }
        }

    }
}
