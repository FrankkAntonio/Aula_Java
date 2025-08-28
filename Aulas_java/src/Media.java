public class Media {
    public static void main(String[] args) {

        double n1 = 7.0;
        double n2 = 8.0;
        double n3 = 9.0;
        double media;

        media = (n1 + n2 + n3) / 3;

        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Está aprovado");
        } else if (media < 4.0) {
            System.out.println("Está reprovado");
        } else {
            System.out.println("Está na final da Champions League");
        }
    }
}
