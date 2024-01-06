import java.util.Scanner;

public class greater_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("B is Greater");
        } else if (a > b) {
            System.err.println("A is Greater");
        } else {
            System.out.println("Equale number");
        }
    }
}