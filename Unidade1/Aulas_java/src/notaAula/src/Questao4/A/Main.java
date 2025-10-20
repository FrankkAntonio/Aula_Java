package Questao4.A;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral clinico = new
        ClinicoGeral("Dr.Pedro", "1250", true, true);

        System.out.println("===Clinico Geral===");
        clinico.tratarPaciente();
        clinico.receitar();
    }
}
