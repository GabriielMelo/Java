package Ex_Vetores10;
// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram

// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
// igual a 6.0 (seis). 

import java.util.Scanner;

public class Aprovados {

    public String nome;
    public double nota1;
    public double nota2;
    public boolean aprovado;

    public Aprovados() {

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
        Aprovados[] vect = new Aprovados[n];

        for (int i = 0; i < n; i++) {
            vect[i] = new Aprovados();

            System.out.println("Digite o nome do aluno : ");
            vect[i].nome = sc.nextLine();

            System.out.println("Digite a primeira nota : ");
            vect[i].nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota : ");
            vect[i].nota2 = sc.nextDouble();
            sc.nextLine();
            if ((vect[i].nota1 + vect[i].nota2) / 2 >= 6) {
                vect[i].aprovado = true;
            } else {
                vect[i].aprovado = false;
            }
            System.out.println("-------------------");
        }
        System.out.println("Alunos Aprovados : ");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            if (vect[i].aprovado) {
                double aux_media = (vect[i].nota1 + vect[i].nota2) / 2;
                System.out.printf("\nAluno : " + vect[i].nome + " Média : " + "%.2f", aux_media);
            } else {
                continue;
            }
        }
        sc.close();
    }

}
