/*
Crie uma classe ContaBancaria que represente uma conta 
bancária básica. A classe deve ter métodos para depositar, sacar e verificar o saldo.
 */
package Exercicio01;

import java.util.Scanner;

public class ContaBancaria {

    private Float saldo;

    Scanner scan = new Scanner(System.in);

    public ContaBancaria(Float saldo) {
        this.setSaldo(saldo);
    }

    public void Depositar() {
        Float valor;
        System.out.println("Qual valor deseja depositar?");
        valor = scan.nextFloat();
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            setSaldo(getSaldo() + valor);
        }
    }
    
    public void Sacar(){
        Float valor;
        System.out.println("Qual o valor deseja Sacar?");
        valor = scan.nextFloat();
        if(valor <=0){
            System.out.println("Valor inválido");
        } else {
            if(valor > this.getSaldo()){
                System.out.println("Saldo Indisponível");
            } else{
                 setSaldo(getSaldo() - valor);
            }
        }
    }
    
    public void consultaSaldo(){
        System.out.println("Saldo disponível : " + getSaldo());
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
}
