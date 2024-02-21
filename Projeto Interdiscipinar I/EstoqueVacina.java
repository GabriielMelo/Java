import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class EstoqueVacina extends ControleVacina {
    // Variaveis Auxiliares
    String fabricado;
    private int entrada;
    private int saida;

    public EstoqueVacina() {

    }

    public EstoqueVacina(String agente, int re, String vacina, String fabricado, int entrada, int saida, int qtvacina) {
        super(agente, re, vacina);
        this.fabricado = fabricado;
        this.entrada = entrada;
        this.saida = saida;
    }

    ArrayList<EstoqueVacina> estoque = new ArrayList<EstoqueVacina>();

    Integer qtvac[] = new Integer[5];
    String vac[] = new String[5];
    String fab[] = new String[5];

    public void ProducaoVacina() {
        for (int i = 0; i < vac.length; i++) {
            int resp = 0;

            resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Setor de Controle e Produção de vacinas\n" +
                    "Qual Vacina deseja Depositar?\n" +
                    "[1]  - Coronavac \n" + "" +
                    "[2]  - Astrazeneca \n" +
                    "[3]  - Pfizer \n" +
                    "[4]  - Gripe \n" +
                    "[5]  - Poliomielite \n" +
                    "[6]  - Sair \n"));
            if (resp == 1) {
                vac[i] = "Coronavac";
                fab[i] = "Fabricado por Instituto Butantan";
                entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                qtvac[i] = entrada;
            } else {
                if (resp == 2) {
                    vac[i] = "Astrazeneca";
                    fab[i] = "Fabricado por AstraZeneca-SKBio";
                    entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                    qtvac[i] = entrada;
                } else {
                    if (resp == 3) {
                        vac[i] = "Pfizer";
                        fab[i] = "Fabricado por BioNTech ";
                        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                        qtvac[i] = entrada;
                    } else {
                        if (resp == 4) {
                            vac[i] = "Gripe";
                            fab[i] = "Fabricado por Instituto Butantan ";
                            entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                            qtvac[i] = entrada;
                        } else {
                            if (resp == 5) {
                                vac[i] = "Poliomielite";
                                fab[i] = "Fabricado por Bio-Manguinhos ";
                                entrada = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                                qtvac[i] = entrada;
                            } else {
                                System.exit(0);
                            }
                        }
                    }
                }
            }

        }
    }

    public void DistribuicaoVacina() {
        for (int i = 0; i < vac.length; i++) {
            int resp = 0;

            resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Setor de Controle e Produção de vacinas\n" +
                    "Qual Vacina deseja retirar?\n" +
                    "[1]  - Coronavac \n" + "" +
                    "[2]  - Astrazeneca \n" +
                    "[3]  - Pfizer \n" +
                    "[4]  - Gripe \n" +
                    "[5]  - Poliomielite \n" +
                    "[6]  - Sair \n"));
            if (resp == 1) {
                vac[i] = "Coronavac";
                fab[i] = "Fabricado por Instituto Butantan";
                saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                qtvac[i] = qtvac[i] - saida;
            } else {
                if (resp == 2) {
                    vac[i] = "Astrazeneca";
                    fab[i] = "Fabricado por AstraZeneca-SKBio";
                    saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                    qtvac[i] = qtvac[i] - saida;
                } else {
                    if (resp == 3) {
                        vac[i] = "Pfizer";
                        fab[i] = "Fabricado por BioNTech ";
                        saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                        qtvac[i] = qtvac[i] - saida;
                    } else {
                        if (resp == 4) {
                            vac[i] = "Gripe";
                            fab[i] = "Fabricado por Instituto Butantan ";
                            saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                            qtvac[i] = qtvac[i] - saida;
                        } else {
                            if (resp == 5) {
                                vac[i] = "Poliomielite";
                                fab[i] = "Fabricado por Bio-Manguinhos ";
                                saida = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
                                qtvac[i] = qtvac[i] - saida;
                            } else {
                                System.exit(0);
                            }
                        }
                    }
                }
            }

        }
    }

    public String toString() {
        return "EstoqueVacina qtvac=" + Arrays.toString(qtvac) + ", vac=" + Arrays.toString(vac) + ", fab="
                + Arrays.toString(fab) + "]";
    }

    public void imprimir() {
        System.out.println("Estoque de vacina");
        for (int i = 0; i < vac.length; i++) {
            System.out.println("Vacina : " + vac[i].toString() + "\n" + fab[i].toString() + "\nQuantidade : "
                    + qtvac[i].toString() + "\n-----------------");
        }

    }

}
