import java.util.Scanner;

public class sum_odd_num {

    static public void printAllOddNumSum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name :- ");
        int num=sc.nextInt();

        printAllOddNumSum(num);
    }
}
