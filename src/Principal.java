import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme meuFilme = new Filme(); //"Filme" da esquerda aponta onde o objeto está - direita cria espaço da memoria para o objeto
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.exibeAvaliacoes();

        Serie theOC = new Serie();
        theOC.setNome ("The O. C.");
        theOC.setAnoDeLancamento(2003);
        theOC.setTemporadas(4);
        theOC.setEpisodiosPorTemporada(25);
        theOC.setMinutosPorEpisodio(44);
        theOC.exibeFichaTecnica();

        Filme outroFilme = new Filme(); //"Filme" da esquerda aponta onde o objeto está - direita cria espaço da memoria para o objeto
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
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
    }
}
