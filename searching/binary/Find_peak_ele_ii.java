import java.util.Arrays;

public class Find_peak_ele_ii {
    public static void main(String[] args) {
        int[][] mat ={{10,20,15},{21,30,14},{7,16,32}};

        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }

    public static int[] findPeakGrid(int[][] mat ){
        int n = mat.length;
        int m = mat[0].length;

        int row = 0;  //left
        int col = mat.length-1; //right

        if (row <= col) {
            int maxCol = row + (col-row)/2;
            int maxRow = findMaximumColum(mat , maxCol);

            boolean isPeak = true;
            if((maxRow > 0 && mat[maxRow-1][maxCol] > mat[maxRow][maxCol])||
               (maxRow < m-1 && mat[maxRow+1][maxCol] > mat[maxRow][maxCol])||
               (maxCol > 0 && mat[maxRow][maxCol-1] > mat[maxRow][maxCol])||
               (maxCol < n-1 && mat[maxRow][maxCol+1] > mat[maxRow][maxCol])
            ){
                isPeak = false;
            }

            if(isPeak)
                return new int[] {maxRow,maxCol};
            else if (maxCol > 0 && mat[maxRow][maxCol] > mat[maxRow][maxCol])
                col = maxCol - 1;
            else
                row = maxRow + 1;
        }
        return new int[]{-1, -1};
    }

    public static int findMaximumColum(int[][] mat,int col){
        int max_row = 0;
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][col] > mat[max_row][col]){
                max_row = i;
            }
        }

        return max_row;
    }
}
