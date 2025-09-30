import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a matricula: ");
        int matricula = sc.nextInt();

        System.out.println("Digite o salario do professor: ");
        double salario = sc.nextDouble();


        Aluno a = new Aluno(nome, matricula);
        Professor p = new Professor(nome);
        Professor p1 = new Professor(salario);

        sc.close();
    }
}