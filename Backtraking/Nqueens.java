public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical top * col is same but row can decrese -1 (row-2,col) (row-1,col)
        // (row,col)

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left * move up left row-1 and col+1 if queen is(1,1) then (1-1,1+1)
        // check (0,2) if Queen here return false otherwise true
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right * move up right row+1 and col-1 if queen is(1,1) then (1+1,1-1)
        // check (0,0) if Queen here return false otherwise true
        for (int i = row - 1, j = col + 1; i >= 0 && j<board.length ; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count= 0;

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printArray(board);
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);
                board[row][col] = '.';
            }

            // print all soluation
            // board[row][col]='Q';
            // nQueens(board, row+1); //funcation call
            // board[row][col]='.'; //bactracking setp (if one time Q add after the can
            // replace .)
        }
    }

    public static void printArray(char chaseBoard[][]) {
        System.out.println("------chase board-------");
        for (int i = 0; i < chaseBoard.length; i++) {
            for (int j = 0; j < chaseBoard.length; j++) {
                System.out.print(chaseBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {    
        int n = 2;
        char chaseBoard[][] = new char[n][n]; // N*N size 2*2

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chaseBoard[i][j] = '.';
            }
        }

        nQueens(chaseBoard, 0);
        System.out.println("Total count of set Q ways: " + count);
    }

}
