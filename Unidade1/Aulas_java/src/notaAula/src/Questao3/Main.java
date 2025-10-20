package Questao3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filme f = new Filme();

        int opcao;

        do {
            System.out.println("\n=== MENU STREAMING ===");
            System.out.println("1. Cadastrar um título");
            System.out.println("2. Exibir detalhes do título");
            System.out.println("3. Avaliar o título");
            System.out.println("4. Exibir média das avaliações");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do filme: ");
                    f.setNome(sc.nextLine());

                    System.out.print("Digite o gênero: ");
                    f.setGenero(sc.nextLine());

                    System.out.print("Digite o ano de lançamento: ");
                    f.setAno(sc.nextInt());

                    System.out.print("Digite a duração em minutos: ");
                    f.setDuracao(sc.nextInt());
                    sc.nextLine(); // limpar buffer

                    System.out.println("Filme cadastrado com sucesso!");
                    break;
                case 2:
                    f.exibirDetalhes();
                    break;
                case 3:
                    System.out.print("Digite a nota (0 a 10): ");
                    int nota = sc.nextInt();
                    f.avaliar(nota);
                    break;
                case 4:
                    double media = f.calcularMediaAvaliacoes();
                    if (media == 0.0) {
                        System.out.println("Ainda não há avaliações.");
                    } else {
                        System.out.printf("Média das avaliações: %.2f\n", media);
                    }
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");



            }
        } while (opcao != 5);
        sc.close();
    }
}
