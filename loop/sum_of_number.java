import java.util.Scanner;

public class sum_of_number {

    public static void main(String[] args){
        Scanner sacn=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int value=sacn.nextInt();

        int i=1,sum=0;
        while (i<=value) {
            sum=sum + i;
            i++;
        };
        System.out.println(sum);
    }
    
}