package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970); //"Filme" da esquerda aponta onde o objeto está (referencia) - direita cria espaço da memoria para o objeto (objeto)
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.exibeAvaliacoes();

        Serie theOC = new Serie("The O. C.", 2003);
        theOC.setTemporadas(4);
        theOC.setEpisodiosPorTemporada(25);
        theOC.setMinutosPorEpisodio(44);
        theOC.exibeFichaTecnica();

        Filme outroFilme = new Filme("Avatar II", 2023); //"Filme" da esquerda aponta onde o objeto está - direita cria espaço da memoria para o objeto
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(theOC);
        System.out.println("\nTempo total de títulos que deseja assistir: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theOC);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var avatar = new Filme("Avatar", 2009); //var faz inferência do tipo declarado
        avatar.setDuracaoEmMinutos(160);
        avatar.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(avatar);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

    }
}
