import java.util.Scanner;

/**
 * twoD_array
 */
public class twoD_array {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row number :- ");
        int row=sc.nextInt();
        System.out.print("Enter Colum number :- ");
        int cols=sc.nextInt();

        int[][] nums=new int[row][cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number You can find :- ");
        int x=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(nums[i][j]==x){
                     System.out.println("Number can present " + i + " " + j);
                     break;
                }
            }
        }
    }
}