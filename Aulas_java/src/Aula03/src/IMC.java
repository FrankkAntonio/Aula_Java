import java.util.Scanner;

public class IMC  {
    public static void main(String[] args){

        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Peso: ");
        p.setPeso(sc.nextDouble());
        System.out.println(p.getPeso());

        System.out.println("Digite sua Altura: ");
        p.setAltura(sc.nextDouble());
        System.out.println(p.getAltura());

        sc.close();

        p.setIMC(p.getPeso()/(p.getAltura()*p.getAltura()));
        System.out.printf("Seu Imc é: %.2f\n", p.getIMC());

        if (p.getIMC() < 18.5) {
            System.out.println("Baixo peso");

        } else if (p.getIMC() >= 18.5 && p.getIMC() < 24.99) {
            System.out.println("Peso normal");
            
        } else if (p.getIMC() >= 25 && p.getIMC() < 29.99) {
            System.out.println("Está com sobrepeso");
            
        } else if (p.getIMC() >= 30) {
            System.out.println("Está com obesidade");
            
        }

    }
}
