/*
Crie uma classe ContaBancaria que represente uma conta 
bancária básica. A classe deve ter métodos para depositar, sacar e verificar o saldo.
 */
package Exercicio01;


public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(0f);
        
        conta1.Depositar();
        conta1.consultaSaldo();
        conta1.Sacar();
        conta1.consultaSaldo();
        conta1.Depositar();
        conta1.consultaSaldo();
    }
}
