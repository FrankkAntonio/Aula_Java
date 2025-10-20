package Questao2;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (%s): R$ %.2f\n", numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saque não realizado. Verifique o saldo e o valor informado.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f para %s realizada com sucesso.\n", valor, destino.titular);
        } else {
            System.out.println("Transferência não realizada. Verifique o saldo e o valor informado.");
        }
    }
}
