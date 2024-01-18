import java.util.Scanner;

public class prime_or_not {

    public static void PrimeOrNot(int num) {
        if(num==1 || num==0){
            System.out.println("Prime number");
        }

        boolean prime=false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=true;
                break;
            }
        }

        if(!prime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num=sc.nextInt();

        PrimeOrNot(num);
    }
}
