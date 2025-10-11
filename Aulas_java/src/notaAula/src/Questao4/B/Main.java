package Questao4.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Vendedor vendedor = new Vendedor();
        Pedido pedido = new Pedido();

        int opcao;

        do {
            System.out.println("\n=== MENU SISTEMA DE VENDAS ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Vendedor");
            System.out.println("3. Registrar Pedido");
            System.out.println("4. Exibir Pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    cliente.setNome(sc.nextLine());

                    System.out.print("CPF do Cliente: ");
                    cliente.setCpf(sc.nextLine());

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do Vendedor: ");
                    vendedor.setNome(sc.nextLine());

                    System.out.print("Matrícula do Vendedor: ");
                    vendedor.setMatricula(sc.nextLine());

                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Número do Pedido: ");
                    pedido.setNumero(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Data do Pedido (dd/mm/aaaa): ");
                    pedido.setData(sc.nextLine());

                    System.out.print("Valor Total do Pedido: R$ ");
                    pedido.setValorTotal(sc.nextDouble());
                    sc.nextLine();

                    pedido.setCliente(cliente);
                    pedido.setVendedor(vendedor);

                    System.out.println("Pedido registrado com sucesso!");
                    break;

                case 4:
                    pedido.exibirPedido();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

