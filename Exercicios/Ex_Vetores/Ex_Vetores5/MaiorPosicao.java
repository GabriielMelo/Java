// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero)

import java.util.Scanner;

public class MaiorPosicao{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double maiorValor=0;
        int maiorIndice = 0;

        while(n<=0){
            System.out.println("Quantos numeros serão inseridos?");
            n = sc.nextInt();
            if(n<=0){
                System.out.println(("Numero inválido"));
            }
        }

        double[] vect = new double[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite o numero");
            vect[i] = sc.nextDouble();
            if(vect[i] > maiorValor){
                maiorValor = vect[i];
                maiorIndice = i;
            }
        }
        System.out.printf("Maior Valor : " + "%.2f", maiorValor);
        System.out.println("\nPosição do maior valor : " + maiorIndice);
        sc.close();
    }
}