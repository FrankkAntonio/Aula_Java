import java.util.Scanner;

public class Pagamento {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua Matricula: ");
        int matricula = sc.nextInt();

        System.out.println("Digite seu Salario bruto: ");
        double salario_bruto = sc.nextDouble();

        sc.close();

        double salario_liquido;
        double inss;

        inss = salario_bruto * 0.15;
        salario_liquido = salario_bruto - inss;


        System.out.println("---Contracheque---");
        System.out.println("Seu nome completo é: " + nome );
        System.out.println("Sua Matricula é: " + matricula);
        System.out.printf("Seu Sálario bruto é:R$ %.2f\n", salario_bruto);
        System.out.printf("Dedução do INSS:R$ %.2f\n", inss);
        System.out.printf("Salario liquido:R$ %.2f\n", salario_liquido);














    }
}
