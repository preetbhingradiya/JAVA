import java.util.Scanner;

public class search_sorted {

    public static int search_matrix(int[][] matrix,int key){

        // for(int i=0;i<matix.length;i++){
        //     for(int j=0;j<matix.length;j++){
        //         if(matix[i][j]==key){
        //             return 1;
        //         }
        //     }
        // }
        // return 0;

        //start with 40(matrix.lenght-1) 
        //key  33<40    left side 30
        //key 50>40     bottom side 45
        int row=0, col = matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            
            if(matrix[row][col]==key){
                return 1;
            }
            else if(key<matrix[row][col]){
                col--;   //moved to the left side of arraty
            }
            else{
                row++;   //key>matrix[row][col]
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1,3},
                // { 15, 25, 35, 45 },
                // { 27, 29, 37, 48 },
                // { 32, 33, 39, 50 } 
                };

        Scanner sc=new Scanner(System.in);
        System.out.println("Search The Element In Array :- ");
        int key=sc.nextInt();

        
        if(search_matrix(matrix, key)==1){
            System.out.println("Key is here to the array");
        }
        else{
            System.out.println("Key is not here to the array");
        }
    }
}
