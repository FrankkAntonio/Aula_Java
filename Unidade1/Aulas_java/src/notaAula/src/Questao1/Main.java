package Questao1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite o seu nome: ");
        f.nome = sc.nextLine();

        System.out.println("Digite o sua Matricula: ");
        f.matricula = sc.nextInt();

        System.out.println("Digite o seu salario: ");
        f.salarioBruto = sc.nextDouble();

        f.exibirContraCheque();
        sc.close();


    }
}
