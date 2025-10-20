package Questao1;

public class Funcionario {
    String nome;
    int matricula;
    double salarioBruto;

    public double calcularInss(){
    return salarioBruto * 0.15;
    }
    public double calcularSalarioLiquido(){
    return salarioBruto - calcularInss();
    }
    public void exibirContraCheque(){
        System.out.println("=== Contracheque ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS (15%%): R$ %.2f\n", calcularInss());
        System.out.printf("Salário Líquido: R$ %.2f\n", calcularSalarioLiquido());
        System.out.println("====================\n");
    }

}