import java.util.Scanner;

public class num_sum {

    public static int sum(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First num :- ");
        int a=sc.nextInt();
        System.out.print("Enter Seconde num :- ");
        int b=sc.nextInt();

        System.out.print("Sum of two number :- " + sum(a, b));
    }    
}
