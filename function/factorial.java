import java.util.Scanner;

public class factorial {

    public static int factorialNamw(int num){
        if(num<0){
            System.out.println("invalid Number");
            return 1;
        }
        int store=1;
        for(int i=num;i>=1;i--){
            store=store*i;
        }
        return store;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number that can find factorial :- ");
        int num=sc.nextInt();

        System.out.println("Factorial value is :- "+ factorialNamw(num));

    }
}
