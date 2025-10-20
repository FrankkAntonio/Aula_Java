import java.util.Scanner;
public class Main {
    public static void main(String[] args){

     Pessoa p = new Pessoa();
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite sua idade: ");
     p.setIdade(sc.nextInt());
     p.niver();

     System.out.println("Daqui a um ano você vai ter: " + p.getIdade());

     sc.close();
    }
}