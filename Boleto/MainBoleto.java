import java.util.Scanner;

public class MainBoleto {
    public static void main(String[] args) {

        Boleto b1 = new Boleto("1323512","Bradesco",500.90,5.0,1.5);
        Boleto b2 = new Boleto("6503123","Itau",900.90,2.0,1.9);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor será debitado do valor total?");
        double valor = sc.nextDouble();
        sc.nextLine();
        b1.aplicaDesconto(valor);
        System.out.printf("Valor total do boleto : " + String.format("%.2f",b1.getValorTotal()));
        System.out.printf("\nValor da Multa : " + String.format("%.2f",b1.calculaValorMulta()));
        System.out.println("\nQual a quantidade de dias de atraso?");
        int dias = sc.nextInt();
        sc.nextLine();
        System.out.printf("\nJuros por dias de atraso : " + String.format("%.2f", b1.calculaValorJuros(dias)));
        System.out.printf("\nValor total do boleto : " + String.format("%.2f",b1.calculaValor(dias)) + "\n");

        b1.imprimir();

        System.out.println("\n-----------------------------------------------------");

        System.out.println("Qual valor será debitado do valor total?");
         valor = sc.nextDouble();
        sc.nextLine();
        b2.aplicaDesconto(valor);
        System.out.printf("\nValor total do boleto : " + String.format("%.2f",b2.getValorTotal()));
        System.out.printf("\nValor da Multa : " + String.format("%.2f",b2.calculaValorMulta()));
        System.out.println("\nQual a quantidade de dias de atraso?");
         dias = sc.nextInt();
        sc.nextLine();
        System.out.printf("\nJuros por dias de atraso : " + String.format("%.2f", b2.calculaValorJuros(dias)));
        System.out.printf("\nValor total do boleto : " + String.format("%.2f",b2.calculaValor(dias)));
        b2.imprimir();
        System.out.println("\nBanco com menor juros diario: " + b1.menorBoleto(b2));
        System.out.println("\nDigite o valor para comparação : ");
         valor = sc.nextDouble();
        System.out.printf("\nO Menor boleto é : ", String.format("%.2f",b1.menorBoleto(valor, b2)));

        sc.close();

    }
}
