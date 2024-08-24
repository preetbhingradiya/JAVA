public class Nkinght {
    public static void main(String[] args) {
        int n = 4;
        char chaseBoard[][] = new char[n][n]; // N*N size 2*2

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chaseBoard[i][j] = '.';
            }
        }

        knight(chaseBoard, 0, 0, 4);
    }

    static void knight(char[][] board, int row, int col, int move){
        if(move==0){
            display(board);
            return;
        }

        //Out of bound just return
        if(row==board.length-1 && col==board.length){
            return;
        }

        if(col==board.length){
            knight(board, row+1, 0, move);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            knight(board, row, col+1, move-1);
            board[row][col] = '.';
        }

        knight(board, row, col+1, move);

    }

    static boolean isSafe(char[][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]=='K'){
                return false;
            }
        }

        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]=='K'){
                return false;
            }
        }

        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]=='K'){
                return false;
            }
        }

        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]=='K'){
                return false;
            }
        }

        return true;
    }

    //If every time check index is out or bound or not
    static boolean isValid(char[][] board, int row, int col){
        if(row >= 0 && col >= 0 && row < board.length && col < board.length){
            return true;
        }
        return false;
    }

    public static void display(char chaseBoard[][]) {
        System.out.println("------Knight Position-------");
        for (int i = 0; i < chaseBoard.length; i++) {
            for (int j = 0; j < chaseBoard.length; j++) {
                System.out.print(chaseBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
