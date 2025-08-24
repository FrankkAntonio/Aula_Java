public class Ignorecase {
    public static void main(String[] args) {

        String a = "Python";
        String b = "Java";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
        }
    }
}