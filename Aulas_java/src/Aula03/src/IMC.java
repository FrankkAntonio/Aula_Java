import java.util.Scanner;

public class IMC  {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Peso: ");
        p.peso = sc.nextDouble();
        System.out.println(p.peso);

        System.out.println("Digite sua Altura: ");
        p.altura = sc.nextDouble();
        System.out.println(p.altura);

        sc.close();

        p.IMC = p.peso/(p.altura*p.altura);
        System.out.printf("Seu Imc é: %.2f\n", p.IMC);

        if (p.IMC < 18.5) {
            System.out.println("Baixo peso");

        } else if (p.IMC >= 18.5 && p.IMC < 24.99) {
            System.out.println("Peso normal");
            
        } else if (p.IMC >= 25 && p.IMC < 29.99) {
            System.out.println("Está com sobrepeso");
            
        } else if (p.IMC >= 30) {
            System.out.println("Está com obesidade");
            
        }

    }
}
