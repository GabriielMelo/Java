public class Main {

    public static void main(String[] args) {

        try {
        Trabalhador f1 = new Funcionario("Natasha Caldeirão",1.500);
        Trabalhador g1 = new Gerente("Sangalo",5.000,"RH");
        Trabalhador a1 = new Assistente("Policial Disfarçado",2.000);
        f1.calcularSalario();
        System.out.println("O Salário de : " + f1.getNome() + " é de : " + f1.getSalario());
        g1.calcularSalario();
        System.out.println("O Salário de : " + g1.getNome() + " é de : " + g1.getSalario());
        a1.calcularSalario();
        System.out.println("O Salário de : " + a1.getNome() + " é de : " + a1.getSalario());
        
        } catch (IllegalArgumentException e ){
            System.out.println("Erro : " + e.getMessage());
        }
    }
}
