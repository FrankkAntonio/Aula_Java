import java.util.Scanner;

public class Calculadora_de_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String r;
        double somanotas = 0;
        int quantidade_de_notas = 0;

        System.out.println("Bem-vindo ao calculador de média do aluno! ");

        do {
            System.out.println("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            somanotas += nota;
            quantidade_de_notas++;

            while (true) {
                System.out.println("Deseja colocar mais uma nota? (Digite 'S' para sim e 'N' para não): ");
                r = sc.next().trim().toUpperCase();

                switch (r) {
                    case "S":
                    case "N":
                        break;
                    default:
                        System.out.println("Dígito inválido. Considerando que você não quer adicionar mais notas.");
                        r = "N";
                        break;
                }

                if (r.equals("S") || r.equals("N")) {
                    break;
                }
            }

        } while (r.equals("S"));

        if (quantidade_de_notas == 0) {
            System.out.println("Nenhuma nota foi inserida!");
        } else {
            double media = somanotas / quantidade_de_notas;
            System.out.printf("Média das notas: %.2f\n", media);
        }

        System.out.println("Obrigado por usar a calculadora!");
        sc.close();
    }
}
