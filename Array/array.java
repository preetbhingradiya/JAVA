import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Length :- ");
        int value=sc.nextInt();

        int[ ] nums=new int[value];

        //input
        for(int i=0;i<value;i++){
            nums[i]=sc.nextInt();
        }     

        System.out.print("Enetr the number you can find :- ");
        int x=sc.nextInt();

        //output
        for(int i=0;i<value;i++){
            if(x==nums[i]){
                System.out.println("Number can found");
            }
        }
    }    
}
