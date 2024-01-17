// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
// o vetor C gerado

import java.util.Scanner;

public class SomaVetores{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = 0;
    while(n<=0){
        System.out.println("Quantos numeros serão inseridos?");
        n = sc.nextInt();
        if(n<=0){
            System.out.println("Numero inválido");
        }
    }

    int[] vectA = new int[n];
    int[] vectB = new int[n];
    int[] vectC = new int[n];
    System.out.println("Digite os Valores para o Vetor A \n");
    for(int i=0;i<n; i++){
        System.out.println("Digite um numero : ");
        vectA[i] = sc.nextInt();
    }
    System.out.println("-----------------------");
    System.out.println("Digite os Valores para o Vetor B \n");
    for(int i=0;i<n; i++){
        System.out.println("Digite um numero : ");
        vectB[i] = sc.nextInt();
    }
    System.out.println("-----------------------");

    System.out.println("Valor Resultante Vetor C: \n");
    for(int i=0;i<n; i++){
        vectC[i] = vectA[i]+vectB[i];
        System.out.println(vectC[i]);
    }
    System.out.println("\n-----------------------");
    sc.close();
}

}