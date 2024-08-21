import java.util.ArrayList;

/**
 * Maze_daigonal_path
 */
public class Maze_daigonal_path {

    public static void main(String[] args) {
        System.out.println(countOfPath(3, 3));
        System.out.println(diagonalOfMaze("",3, 3));

    }

    static int countOfPath(int row, int col){
        if(row==1 || col ==1){
            return 1;
        }

        int left = countOfPath(row-1, col);
        int right = countOfPath(row, col-1);
        int diagonal = 0;
        if(row > 1 && col > 1){
            diagonal = countOfPath(row-1, col-1);
        }

        return left+right+diagonal;
    }

    static ArrayList<String> diagonalOfMaze(String empStr, int row, int col){
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) { 
            list.add(empStr);
            return list;
        }

        if(row > 1 && col > 1){
            list.addAll(diagonalOfMaze(empStr + 'D', row-1, col-1)); //d=>diagonal
        }

        if(row > 1){ 
            list.addAll(diagonalOfMaze(empStr + "V", row-1, col)); //V=>verticcal
        }

        if(col > 1){ 
            list.addAll(diagonalOfMaze(empStr + "H", row, col-1)); //H=>horizntal
        }

        return list;
    }
}