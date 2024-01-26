import java.util.Scanner;

public class max_min_num {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Length :- ");
        int value = sc.nextInt();

        int num[] = new int[value];

        for (int i = 0; i < value; i++) {
            num[i] = sc.nextInt();
        }

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 0; i < value; i++) {
            if (Min > num[i]) {
                Min = num[i];
            }
            
            if (Max < num[i]) {
                Max = num[i];
            }
        }
        System.out.println("Minimum value is :- "+Min);
        System.out.println("Maximum value is :- " + Max);
    }
}