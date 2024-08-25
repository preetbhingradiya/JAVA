
public class Sudoku_solver {

    public static boolean isSafe(int sudoku[][] ,int row,int col,int digit){

        //column condition
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //row condtion
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==digit){
                return  false;
            }
        }

        //grid 3*3 grid(sale)   
        int sr = (row/3) * 3;
        int sc = (col/3) *3;

        for(int i=sr;i<sr+3;i++){  //row 
            for(int j=sc;j<sc+3;j++){  // col
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9) return true;   

        //recusrion

        int nextRow=row , nextCol = col+1;
        if(col+1==9){ // first row last element 
            nextRow = row+1; // second row
            nextCol = 0; //  0 index of second row
        }    

        if(sudoku[row][col] != 0){  // if the place is correctly not 0 so not replace
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){  //safe of replace 0 on 0 to 9 digit
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){  //soluation is exit
                    return true;
                }
                sudoku[row][col]=0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args){
        int sudoku[][]={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};

       boolean soluation= sudokuSolver(sudoku, 0, 0);
       if(soluation){
        printSudoku(sudoku);
       }else{
        System.out.println("souation does not exit...");
       }
    }
    
}
