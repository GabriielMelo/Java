// Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.

import java.time.LocalDate;

public class Jogador {
    
    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public void Aposentar(Jogador jogador){
        int aux_idade = jogador.CalcIdade(jogador.anoNascimento);
        if(jogador.getPosicao().equals("Defesa")){
            if(aux_idade >= 40){
                System.out.println("Pode se aposentar");    
            } else {
                System.out.println("Não pode se aposentar");
            }
        } else if(jogador.getPosicao().equals("meio-campo")){
            if(aux_idade >= 38){
                System.out.println("Pode se aposentar");
            } else {
                System.out.println("Não pode se aposentar");
            }
        } else {
            if(aux_idade >= 35){
                System.out.println("Pode se aposentar");
            } else {
                System.out.println("Não pode se aposentar");
            }
        }
    }

    public Jogador(String n, String p, int an, String nac, double alt, double ps){
        this.setNome(n);
        this.setPosicao(p);
        this.setAnoNascimento(an);
        this.setNacionalidade(nac);
        this.setAltura(alt);
        this.setPeso(ps);
    }

    public int CalcIdade(int anoNascimento){    
        LocalDate data = LocalDate.now();
        int anoAtual = data.getYear();
        int idade =  anoAtual - anoNascimento;
        System.out.println("Idade " + idade);
        return idade;
    }

    public String Imprimir(){
        return "Jogador : " + this.getNome() + "\nPosição : " + this.getPosicao() + 
        "\nAno de Nascimento : " + this.getAnoNascimento() + "\nNacionalidade : " + this.getNacionalidade() + 
        "\nAltura : " + this.getAltura() + "\nPeso : " + this.getPeso();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    

}

