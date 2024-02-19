import java.util.Scanner;

public class perfectnumber {

    public static int perfectNumber(int num){
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum==num){
            return sum;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Num :- ");
        int num=sc.nextInt();

        
        System.out.print(perfectNumber(num));
    }
}
