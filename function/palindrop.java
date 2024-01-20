import java.util.Scanner;

public class palindrop {

    public static void palindropNumber(int num){
        int temp=num,r,sum=0;
        while (num>0) {
            r=num%10;  //454 % 10  = 4
            sum=(sum*10)+r;  //0*10+4 =4
             num=num/10;      //454 / 10 =45
        }

        if(temp==sum){
            System.out.println("Palindrop number");
        }
        else{
            System.out.println("Not A Palindrop Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The number :- ");
        int num=sc.nextInt();

        palindropNumber(num);
    }
}
