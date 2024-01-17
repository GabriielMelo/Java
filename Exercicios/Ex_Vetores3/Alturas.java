// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.

import java.util.Scanner;

public class Alturas {

    public String nome;
    public int idade;
    public double altura;

    public Alturas() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        double mediaAltura = 0;
        int pessoasMenor16 = 0;

        while (n <= 0) {
            System.out.println("Digite a quantidade de pessoas que deseja cadastrar");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Número de pessoas inválido");
            }
        }

        Alturas[] vect = new Alturas[n];

        for (int i = 0; i < n; i++) {
            vect[i] = new Alturas();
            System.out.println("Digite o nome: ");
            vect[i].nome = sc.next();
            System.out.println("Digite a idade");
            vect[i].idade = sc.nextInt();
            System.out.println("Digite a altura: ");
            vect[i].altura = sc.nextDouble();
            mediaAltura += vect[i].altura;

            if (vect[i].idade < 16) {
                pessoasMenor16++;
            }
        }

        String[] nomesMenor16 = new String[pessoasMenor16];
        mediaAltura = mediaAltura / n;

        for (int i = 0, j = 0; i < n; i++) {
            System.out.println("\n-----------------");
            System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\n", vect[i].nome, vect[i].idade, vect[i].altura);
            if (vect[i].idade < 16) {
                nomesMenor16[j] = vect[i].nome;
                j++;
            }
        }

        double porcentagemIdade = ((double) pessoasMenor16 / n) * 100;
        System.out.println("\n-----------------");
        System.out.printf("Altura média: %.2f\n", mediaAltura);
        System.out.printf("Porcentagem de pessoas menores de 16 anos: %.1f%%\n", porcentagemIdade);
        System.out.println("\n-----------------");
        for (String nome : nomesMenor16) {
            System.out.println(nome);
        }

        sc.close();
    }
}