/**
 * Maze proble are applying two matrix like here 3 by 3
 * element is (3,3) now it can get last postion of (0,0)
 * so count how many way to achieve this target and element are move onl right nd down side
 */
public class Maze {

    public static void main(String[] args) {
        System.out.println(mazeProblem(3, 3));
    }

    static int mazeProblem(int row, int col){
        if (row==1 || col==1) {
            return 1;
        }

        int left = mazeProblem(row-1, col);
        int right = mazeProblem(row, col-1);

        return left+right;
    }
}