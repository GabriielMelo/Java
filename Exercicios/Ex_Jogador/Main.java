public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Pelé", "meio-campo", 1973, "Brasileiro", 1.77, 80);
        Jogador j2 = new Jogador("Ronaldo", "Defesa", 1993, "Baiano", 1.65, 68);
        Jogador j3 = new Jogador("Kadu Meireles", "Atacante", 2000, "Paraiba", 1.90, 100);

        System.out.println(j1.Imprimir());
        j1.CalcIdade(j1.getAnoNascimento());
        j1.Aposentar(j1);
        System.out.println("-------------------------------\n");
        System.out.println(j2.Imprimir());
        j2.CalcIdade(j2.getAnoNascimento());
        j2.Aposentar(j2);
        System.out.println("-------------------------------\n");
        System.out.println(j3.Imprimir());
        j3.CalcIdade(j3.getAnoNascimento());
        j3.Aposentar(j3);
        System.out.println("-------------------------------\n");

        
        
    }
}
