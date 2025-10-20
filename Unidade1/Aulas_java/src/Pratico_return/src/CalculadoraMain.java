import java.util.Scanner;
public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        double n1, n2;
        System.out.println("Digite um número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite um segundo número: ");
        n2 = sc.nextDouble();
        System.out.println(c.somar(n1,n2));


    }
}