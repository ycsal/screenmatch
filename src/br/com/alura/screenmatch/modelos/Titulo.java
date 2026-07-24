package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private int horas;
    private int minutos;

    // getter buscar valor
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //setter incluir valor no atributo
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void calculaDuracaoEmHoras(){
        horas = getDuracaoEmMinutos()/60;
        minutos = getDuracaoEmMinutos()%60;
        System.out.println("Duração: " + horas + "h" + minutos);
    }

    public void exibeFichaTecnica(){
        System.out.println('\n' + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        calculaDuracaoEmHoras();
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double calculaMediaAvaliacoes(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public void exibeAvaliacoes(){
        System.out.println(String.format("Avaliação dada por %d usuários: %.1f", getTotalDeAvaliacoes(),  calculaMediaAvaliacoes()));
    }
}
