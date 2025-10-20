package Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do Titular: ");
        String titular = sc.nextLine();

        System.out.print("Digite o número da Conta: ");
        String numeroConta = sc.nextLine();


        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setTitular(titular);
        minhaConta.setNumeroConta(numeroConta);


        ContaBancaria contaDestino = new ContaBancaria();
        contaDestino.setTitular("João");
        contaDestino.setNumeroConta("5000024");

        int opcao;
        do {
            System.out.println("\n=== MENU BANCÁRIO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Informe o valor para o depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Informe o valor para saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Informe o valor para transferir: R$ ");
                    double valorTransferencia = sc.nextDouble();
                    minhaConta.transferir(contaDestino, valorTransferencia);
                    break;
                case 0:
                    System.out.println("Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
