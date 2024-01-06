import java.util.Scanner;

public class prime {
    // prime number=2,3,5,7,11,13,17...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Not A Prime");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("not A Prime number");
                break;
            } else {
                System.out.println("Prime number");
            }
        }

    }
}
