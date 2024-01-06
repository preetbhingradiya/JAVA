import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String Arithmetic = sc1.next();

        switch (Arithmetic) {
            case "+":
                System.out.println("Sum of A and B is :" + (value1 + value2));
                break;
            case "-":
                System.out.println("Divison of A and B is :" + (value1 - value2));
                break;
            case "*":
                System.out.println("Multi of A and B is :" + (value1 * value2));
                break;
            case "/":
                System.out.println("Divi of A and B is :" + (value1 / value2));
                break;
            case "%":
                System.out.println("Module of A and B is :" + (value1 % value2));
                break;
            default:System.out.println("Invalid Token");
                break;
        }
    }
}
