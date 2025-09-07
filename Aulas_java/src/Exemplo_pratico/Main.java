
public class Main
{
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        int total;

        total = num1+num2;

        if (num1 > num2){
            System.out.println("É maior");

        } else if (num1 == num2){
            System.out.println("É igual");

        } else {
            System.out.println("É menor");
        }

        System.out.println(total);
    }
}