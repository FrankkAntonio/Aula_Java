import java.util.Scanner;

public class IMC_PESSOAL {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Peso: ");
        double peso = sc.nextDouble();
        System.out.println(peso);

        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println("altura");

        sc.close();

        double IMC = peso/(altura*altura);

        if (IMC < 18.5) {
            System.out.println("Baixo peso");

        }

    }
}
