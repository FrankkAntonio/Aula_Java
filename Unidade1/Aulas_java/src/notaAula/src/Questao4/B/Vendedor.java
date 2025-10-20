package Questao4.B;

public class Vendedor {
    String nome;
    String matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Vendedor: " + nome + " | Matrícula: " + matricula);
    }
}

