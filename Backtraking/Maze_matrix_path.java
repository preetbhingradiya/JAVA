import java.util.Arrays;

public class Maze_matrix_path {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];
        mazeOfMaztrixPath("", maze, 0, 0, path, 1);
    }

    static void mazeOfMaztrixPath(String empStr, boolean[][] maze, int row, int col, int[][] path, int step) {
        if(row==maze.length-1 && col==maze[0].length-1){
            path[row][col] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(empStr);
            System.out.println();
            return;
        }


        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            mazeOfMaztrixPath(empStr + "D", maze, row + 1, col, path, step+1);
        }

        if (col < maze[0].length - 1) {
            mazeOfMaztrixPath(empStr + "R", maze, row, col + 1, path, step+1);
        }

        if (row > 0) {
            mazeOfMaztrixPath(empStr + "U", maze, row - 1, col, path, step+1);
        }

        if (col > 0) {
            mazeOfMaztrixPath(empStr + "L", maze, row, col - 1, path, step+1);
        }

        //bactracking so change all the update we made in previous function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}