import java.net.SocketOption;
import java.util.Scanner;

public class CalcularadoraMain {
    public static void main(String[] args){

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        c.n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        c.n2 = sc.nextDouble();
        c.somar();

        sc.close();
    }
}