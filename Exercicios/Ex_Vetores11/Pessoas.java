package Ex_Vetores11;

import java.util.Scanner;

// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
// que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
// de homens. 

public class Pessoas {

    double altura;
    String sexo;

    public Pessoas(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.println("Quantas Pessoas deseja cadastrar?");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Numero inválido");
            }
        }
        sc.nextLine();

        Pessoas[] vect = new Pessoas[n];
        
        for(int i=0;i<n;i++){
            int aux_i = i+1;
            System.out.println("Digite a altura da " + aux_i + "a pessoa");
            vect[i].altura = sc.nextDouble();
            System.out.println("Genero da " + aux_i + "a pessoa");
            vect[i].sexo = sc.nextLine();
        }

        sc.close();
    }
}
