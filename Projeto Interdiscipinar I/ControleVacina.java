import javax.swing.JOptionPane;

public abstract class ControleVacina {
    protected String agente;
    private int re;
    public String vacina;

    public ControleVacina() {
    }

    public ControleVacina(String agente, int re, String vacina) {
        this.agente = agente;
        this.re = re;
        this.vacina = vacina;
    }

    public void Login() {
        JOptionPane.showMessageDialog(null, "Bem Vindo ao Controle De Vacinas\n"
                + "              == Login == ");
        agente = JOptionPane.showInputDialog(null, "Digite o Nome do agente : ");
        setRe(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o RE do agente")));
    }

    public abstract void imprimir();

    public String toString() {
        return "ControleVacina \nAgente " + agente + ", \nRE " + re + "";
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

}
