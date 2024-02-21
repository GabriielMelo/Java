import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AplicacaoVacina extends ControleVacina {
    public String nome;
    private int idade;
    private String dose;
    private float eficacia;
    private String cpf;

    ArrayList<AplicacaoVacina> aplica = new ArrayList<AplicacaoVacina>();

    public AplicacaoVacina() {
    }

    public AplicacaoVacina(String agente, int re, String vacina, String nome, int idade, String dose, float eficacia,
            String cpf) {
        super(agente, re, vacina);
        this.nome = nome;
        this.idade = idade;
        this.dose = dose;
        this.eficacia = eficacia;
        this.cpf = cpf;
    }

    public void aplicaVacina() {
        String resp;

        JOptionPane.showMessageDialog(null, "Olá seja bem vindo ao sistema de aplicação de vacinas!");
        do {

            int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual vacina será aplicada?\n" +
                            "[1]  - Coronavac \n" + "" +
                            "[2]  - Astrazenica \n" +
                            "[3]  - Pfizer \n" +
                            "[4]  - Gripe \n" +
                            "[5]  - Poliomielite \n" +
                            "[6]  - Sair \n"));
            switch (op) {
                case 1:
                    ;
                    AplicacaoVacina aux1;
                    aux1 = new AplicacaoVacina();
                    aux1.nome = JOptionPane.showInputDialog("Digite o nome do paciente ");
                    aux1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do paciente"));
                    aux1.setCpf(JOptionPane.showInputDialog("Digite o CPF do paciente"));
                    aux1.vacina = "Aplicado : Coronavac";
                    eficacia = 55.5f;
                    aux1.dose = "Necessario 3 doses";
                    aplica.add(aux1);
                    break;
                case 2:
                    ;
                    AplicacaoVacina aux2;
                    aux2 = new AplicacaoVacina();
                    aux2.nome = JOptionPane.showInputDialog("Digite o nome do paciente ");
                    aux2.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do paciente"));
                    aux2.setCpf(JOptionPane.showInputDialog("Digite o CPF do paciente"));
                    aux2.vacina = "Aplicado : AstraZeneca";
                    eficacia = 82.9f;
                    aux2.dose = "Necessario 2 doses";
                    aplica.add(aux2);
                    break;
                case 3:
                    AplicacaoVacina aux3;
                    aux3 = new AplicacaoVacina();
                    aux3.nome = JOptionPane.showInputDialog("Digite o nome do paciente ");
                    aux3.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do paciente"));
                    aux3.setCpf(JOptionPane.showInputDialog("Digite o CPF do paciente"));
                    aux3.vacina = "Aplicado : Pfizer";
                    eficacia = 89.5f;
                    aux3.dose = "Necessário 2 doses";
                    aplica.add(aux3);
                    break;
                case 4:
                    ;
                    AplicacaoVacina aux4;
                    aux4 = new AplicacaoVacina();
                    aux4.nome = JOptionPane.showInputDialog("Digite o nome do paciente ");
                    aux4.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do paciente"));
                    aux4.setCpf(JOptionPane.showInputDialog("Digite o CPF do paciente"));
                    aux4.vacina = "Aplicado : Gripe";
                    eficacia = 99.9f;
                    aux4.dose = "Dose Única";
                    aplica.add(aux4);
                case 5:
                    ;
                    AplicacaoVacina aux5;
                    aux5 = new AplicacaoVacina();
                    aux5.nome = JOptionPane.showInputDialog("Digite o nome do paciente ");
                    aux5.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do paciente"));
                    if (aux5.idade >= 5 && aux5.idade <= 1) {
                        JOptionPane.showMessageDialog(null, "Vacina de poliomelite para idades entre 1 e 5 anos");
                        break;
                    }
                    aux5.vacina = "Aplicado : Poliomielite";
                    eficacia = 99.9f;
                    aux5.dose = "Dose Única";
                    aplica.add(aux5);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Até logo");
                    break;
                default:
                    System.exit(0);
            }
            resp = JOptionPane.showInputDialog("Deseja Aplicar outra Vacina? (S/N)");

        } while (resp.equalsIgnoreCase("s"));

    }

    public String toString() {
        return "AplicacaoVacina \nPaciente : " + nome
                + " \nIdade : " + idade + "\n" + vacina + "\n"
                + dose;
    }

    public void imprimir() {

        for (int i = 0; i < aplica.size(); i++) {
            System.out.println((aplica.get(i)).toString());
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public float getEficacia() {
        return eficacia;
    }

    public void setEficacia(float eficacia) {
        this.eficacia = eficacia;
    }

}
