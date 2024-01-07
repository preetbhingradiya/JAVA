import java.util.Scanner;

public class table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you can show");
        int table=sc.nextInt();

        for(int i=0;i<=10;i++){
            System.out.println(table + "*" + i+ "=" +(table*i));
        }
    }
}
