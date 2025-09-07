import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.next();
        System.out.println(nome);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println(idade);

        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println(altura);

        sc.close();

        if (idade >= 18){
            System.out.println("Você é maior de idade");

        } else if (idade < 18) {
            System.out.println("Você é menor de idade");
        }


    }
}