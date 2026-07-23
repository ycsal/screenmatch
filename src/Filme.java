public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;
    int horas;
    int minutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void calculaDuracaoEmHoras(){
        horas = duracaoEmMinutos/60;
        minutos = duracaoEmMinutos%60;
    }

    void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + horas + "h" + minutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calculaMediaAvaliacoes(){ //trocar void para double
        return somaDasAvaliacoes/totalDeAvaliacoes; // return divisao, excluindo a avaliacao e tira o sout

    }



}
