import java.util.Scanner;

public class spiral_order_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The RowNumber :-  ");
        int row=sc.nextInt();
        System.out.print("Enter The ColNumber :-  ");
        int col=sc.nextInt();


        int[][] nums=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        int RowStart=0;
        int RowEnd=row-1;
        int colStart=0;
        int colEnd=col-1;

        while (RowStart<=RowEnd && colStart<=colEnd) {
            
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(nums[RowStart][i] + " ");
            }
            RowStart++;


            for(int i=RowStart;i<=RowEnd;i++){
                System.out.print(nums[i][colEnd] + " ");
            }
            colEnd--;

            for(int i=colEnd;i>=colStart;i--){
                System.out.print(nums[RowEnd][i] + " ");
            }
            RowEnd--;

            for(int i=RowEnd;i>=RowStart;i--){
                System.out.print(nums[i][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}
