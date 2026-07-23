public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    int horas;
    int minutos;

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

    void calculaMediaAvaliacoes(){ //trocar void para double
        avaliacao = somaDasAvaliacoes/totalDeAvaliacoes; // return divisao, excluindo a avaliacao e tira o sout
        System.out.println(String.format("Avaliação dada por usuários: %.1f", avaliacao));
    }



}
