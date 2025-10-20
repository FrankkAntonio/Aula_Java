import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite 1-soma, 2-subtração, 3-divisão, 4-multiplicação: ");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Digite o primeiro valor: ");
                    int n1 = sc.nextInt();
                    System.out.print("Digite o segundo valor: ");
                    int n2 = sc.nextInt();
                    int resultado = n1 + n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Digite o primeiro valor: ");
                    int n3 = sc.nextInt();
                    System.out.print("Digite o segundo valor: ");
                    int n4 = sc.nextInt();
                    int resultado2 = n3 - n4;
                    System.out.println("Resultado: " + resultado2);
                    break;
                case 3:
                    System.out.print("Digite o primeiro valor: ");
                    int n5 = sc.nextInt();
                    System.out.print("Digite o segundo valor: ");
                    int n6 = sc.nextInt();
                    if (n6 != 0) {
                        int resultado3 = n5 / n6;
                        System.out.println("Resultado: " + resultado3);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o primeiro valor: ");
                    int n7 = sc.nextInt();
                    System.out.print("Digite o segundo valor: ");
                    int n8 = sc.nextInt();
                    int resultado4 = n7 * n8;
                    System.out.println("Resultado: " + resultado4);
                    break;
                default:
                    System.out.println("Dígito inválido!");
                    break;
            }

            // Loop para garantir que o usuário digite S ou N corretamente
            while (true) {
                System.out.println("Digite S para voltar ou N para sair:");
                r = sc.next();
                if (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }

        } while (r.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado!");
        sc.close();
    }
}
