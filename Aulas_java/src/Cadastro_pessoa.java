import  java.util.Scanner;
public class Cadastro_pessoa {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String resposta;

      do {
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("\t Dados cadastrados:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);

            System.out.println("\t Deseja cadastrar outra pessoa? Digite S se sim: \n Se não digite qualquer tecla");
            resposta = sc.nextLine();

      }while (resposta.equalsIgnoreCase("S"));
      sc.close();
      System.out.println("Cadastro realizado com sucesso!");






    }
}