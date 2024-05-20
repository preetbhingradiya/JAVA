import java.util.Scanner;

/**
 * PresentNum
 */
public class PresentNum {

    public static void main(String[] args) {
        int num = 1232562;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you can count :");
        int n = sc.nextInt();

        int count=0;
        while (num >0 ) {
            int rem = num%10;
            if(rem == n){
                count++;
            }
            num = num/10;
        }

        System.out.println(count);
    }
}