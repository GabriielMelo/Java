import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LojaEletronica loja = new LojaEletronica();

        int op = 0;

        while(op != 4){
            System.out.println("Selecione uma opção :\n");
            sc.nextLine();
            System.out.println("1.Adicionar Estoque" +  
                             "\n2.Listar Produtos" + 
                             "\n3.Efetuar Venda"+ 
                             "\n4.Sair");
                             op = sc.nextInt();
                             sc.nextLine();

            switch(op){
                case 1:
                System.out.println("1.Para Smartphone\n" + 
                "2.Para Desktop");
                while(op)
                loja.addEstoque();
                break;
                case 2: 

                break;
                case 3:

                break;
                case 4:
                System.exit(op);
                break;
                default: 
                System.out.println("Opção Inválida!");
            }
                             
        }


    }
}
