public class Principal {
    static void main() {
        Filme meuFilme = new Filme(); //"Filme" da esquerda aponta onde o objeto está - direita cria espaço da memoria para o objeto
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.horas = meuFilme.duracaoEmMinutos/60;
        meuFilme.minutos = meuFilme.duracaoEmMinutos%60;

        System.out.println(meuFilme.nome);
        System.out.println("Ano de Lançamento: " + meuFilme.anoDeLancamento);
        System.out.println("Duração: " + meuFilme.horas + "h" + meuFilme.minutos);


    }
}
