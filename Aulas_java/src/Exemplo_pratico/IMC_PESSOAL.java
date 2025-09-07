import java.util.Scanner;

public class IMC_PESSOAL {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Peso: ");
        double peso = sc.nextDouble();
        System.out.println(peso);

        System.out.println("Digite sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println(altura);

        sc.close();

        double IMC = peso/(altura*altura);
        System.out.printf("Seu Imc é: %.2f\n", IMC);

        if (IMC < 18.5) {
            System.out.println("Baixo peso");

        } else if (IMC >= 18.5 && IMC < 24.99) {
            System.out.println("Peso normal");
            
        } else if (IMC >= 25 && IMC < 29.99) {
            System.out.println("Está com sobrepeso");
            
        } else if (IMC >= 30) {
            System.out.println("Está com obesidade");
            
        }

    }
}
