import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        String r;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite 1, 2 ou 3");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida");
                    break;
                default:
                    System.out.println("Opção ivalida");
            }

            System.out.println("Para ver novamente digite S");
            r = sc.next();
            }while(r.equalsIgnoreCase("S"));
          sc.close();



    }

}