package Questao4.B;

public class Cliente {
    String nome;
    String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }
}

