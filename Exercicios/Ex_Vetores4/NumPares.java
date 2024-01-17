// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares.

import java.util.Scanner;

public class NumPares{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int pares = 0;
        while(n<=0){
            System.out.println("Quantos numeros serão inseridos?");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("Numero inválido");
            }
        }

        int[] vect = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o numero : ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros Pares : ");
        for(int i=0;i<n;i++){
            if(vect[i] % 2 ==0){
                System.out.println(vect[i]);
                pares ++;
            } else {
                continue;
            }
        }
        System.out.println("Quantidade de numeros pares : "+ pares);
        sc.close();
    }
}