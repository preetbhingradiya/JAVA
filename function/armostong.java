import java.util.Scanner;

public class armostong {

    public static void armostongNumber(int num){
        int originalNumber,reminder,result=0;
        int length=(int)(Math.log10(num)+1);  //find length
        originalNumber=num;
        
        while (originalNumber!=0) {
            reminder=originalNumber%10;
            result += Math.pow(reminder, length);
            originalNumber /= 10;
        }

        if(result==num){
            System.out.println(num + " is an armostrong number.");
        }
        else{
            System.out.println(num + " is not an armostrong number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :- ");
        int num = sc.nextInt();

        armostongNumber(num);
        //153
    //      3      3       3
        //(1)  + (5)  + (3)   = 1+125+27== 153
    }   
}
