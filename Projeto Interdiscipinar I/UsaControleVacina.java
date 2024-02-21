
import javax.swing.JOptionPane;

public class UsaControleVacina extends ControleVacina {
    public static void main(String[] args) {
        int op = 0;
        ControleVacina recepcao = new AplicacaoVacina();
        ControleVacina agente = new AplicacaoVacina();
        ControleVacina estoquista = new EstoqueVacina();

        recepcao.Login();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Sistema de controle de Vacinas\n" +
                            "        ==  Menu principal ==\n" +
                            "[1]  - Aplicação de vacina \n" + "" +
                            "[2]  - Verificar Registro de Vacinados \n" +
                            "[3]  - Cadastrar entradas Vacinas \n" +
                            "[4]  - Cadastrar Saída de Vacinas \n" +
                            "[5]  - Sair \n"));
            switch (op) {
                case 1:
                    ((AplicacaoVacina) agente).aplicaVacina();
                    agente.imprimir();
                    break;
                case 2:
                    ((AplicacaoVacina) agente).imprimir();
                    break;
                case 3:
                    ((EstoqueVacina) estoquista).ProducaoVacina();
                    estoquista.imprimir();
                    break;
                case 4:
                    ((EstoqueVacina) estoquista).DistribuicaoVacina();
                    estoquista.imprimir();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Finalizando Programa.... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }

        } while (op != 5);
        JOptionPane.showMessageDialog(null, "Programa encerrado! Até Logo!");
    }

    public void imprimir() {

    }

}
