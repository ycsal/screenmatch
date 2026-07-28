package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main() {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970); //"Filme" da esquerda aponta onde o objeto está (referencia) - direita cria espaço da memoria para o objeto (objeto)
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar II", 2023); //"Filme" da esquerda aponta onde o objeto está - direita cria espaço da memoria para o objeto
        outroFilme.avalia(9);
        var avatar = new Filme("Avatar", 2009); //var faz inferência do tipo declarado
        avatar.avalia(7.5);
        Serie theOC = new Serie("The O. C.", 2003);
        theOC.avalia(8.5);

        //objeto só é criado com o "new", por ex. new Filme();
        Filme f1 = avatar; //variável de referência. usada p chegar ate o objeto (nesse caso ja existente)

        List<Titulo> listaAssistidos = new LinkedList<>();
        listaAssistidos.add(avatar);
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(theOC);
        for (Titulo item: listaAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { //ideal evitar, não é de boas práticas
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Emma Stone");
        buscaPorArtista.add("Julia Roberts");
        buscaPorArtista.add("Dove Cameron");
        buscaPorArtista.add("Zac Efron");
        buscaPorArtista.add("Emma Roberts");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);
        Collections.sort(listaAssistidos);
        System.out.println("Lista de titulos ordenados: " + listaAssistidos);
        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaAssistidos);
    }
}
