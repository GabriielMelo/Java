package Ex_Vetores9;

import java.util.Scanner;

public class MaisVelho {

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

        sc.nextLine(); // Consumir a quebra de linha residual

        String[] nomes = new String[n];
        int[] idades = new int[n];
        String maisVelho = "";
        int idade = 0; // Inicializar com um valor alto

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome : ");
            nomes[i] = sc.nextLine();
            System.out.println("Digite a idade : ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha residual

            if (idades[i] > idade) {
                maisVelho = nomes[i];
                idade = idades[i];
            }
        }

        System.out.println("Pessoa mais velha é : " + maisVelho);

        sc.close();
    }
}