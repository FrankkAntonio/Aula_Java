public class Descontos {
    public static void main(String[] args) {

        double salario = 1518;
        double ir;

        if (salario <= 900) {
            System.out.println("Isento");
        }
        else if (salario > 900 && salario <= 1500) {
            ir = (salario *5)/100;
            salario = salario - ir;
            System.out.println("O sálario é: " + salario+ " o imposto é " + ir + " ir de 5%");
        }
        else if (salario > 1500 && salario <= 2500) {
            ir = (salario *10)/100;
            salario = salario - ir;
            System.out.println("O sálario é: " + salario+ " o imposto é "+ ir + " ir de 10%");

        }
        else {
            ir = (salario *20)/100;
            salario = salario - ir;
            System.out.println("O sálario é: " + salario+ " o imposto é "+ ir+ " ir de 20%");

        }
    }
}
