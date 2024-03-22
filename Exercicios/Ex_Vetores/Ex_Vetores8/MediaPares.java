package Ex_Vetores8;

// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

import java.util.Scanner;

public class MediaPares {

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
        int[] vect = new int[n];
        int count = 0;
        int media = 0; 
        for(int i=0;i<n; i++){
            System.out.println("digite o numero : ");
            vect[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(vect[i] % 2 == 0){
                media += vect[i];
                count++;
            } else {
                continue;
            }
        }
        if(count == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            for(int i=0;i<n;i++){
                System.out.println(vect[i]);
            }
            media = media/count;
            System.out.println("Média dos pares : " + media);
        }
        sc.close();
    }
}
