import java.util.Scanner;

/**
 * fibonacci_series
 */
public class fibonacci_series {

    public static void bifonaciSeries(int num){
        int fristNumber=0,secondNumber=1;

        for(int i=1;i<=num;i++){
            System.out.print(fristNumber + " ");

            int nextNumber=fristNumber+secondNumber;
            fristNumber=secondNumber;
            secondNumber=nextNumber;

            //next=0+1=1   next=1+1=2   next=1+2=3  next=2+3=5
            //fri=1;       fri=1;         fir=2     fir=3
            //next=1       sec=2          sec=3     sec=5

            //0 1 1 2 3 5 8 ....
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :- ");
        int num=sc.nextInt();

        bifonaciSeries(num);
    }
}