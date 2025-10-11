package Questao3;

public class Filme {
   private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private int somaNotas =0;
    private int qtdAvaliacoes = 0;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        System.out.println("\t=== Detalhes do Filme ===");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");

    }
    public void avaliar(int nota){
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso.");
        } else {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
        }

    }

    public double calcularMediaAvaliacoes(){
        if (qtdAvaliacoes == 0){
            return 0.0;
        }
        return (double) somaNotas / qtdAvaliacoes;

    }


}
