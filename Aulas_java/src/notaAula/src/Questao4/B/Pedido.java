package Questao4.B;

public class Pedido {
    int numero;
    String data;
    double valorTotal;
    Cliente cliente;
    Vendedor vendedor;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void exibirPedido() {
        System.out.println("\n=== DADOS DO PEDIDO ===");
        System.out.println("Número: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Valor Total: R$ " + valorTotal);
        cliente.exibirDados();
        vendedor.exibirDados();
        System.out.println("=========================");
    }
}

