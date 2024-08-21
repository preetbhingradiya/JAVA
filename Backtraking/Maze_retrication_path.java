public class Maze_retrication_path {
    public static void main(String[] args) {
        boolean[][] maz = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };

        mazeRetrication("", maz, 0, 0);
    }

    static void mazeRetrication(String empStr, boolean[][] maze, int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(empStr);
            return;
        }

        if(!maze[row][col]){
            return; //stop the recursion call
        } 
        if(row < maze.length-1){
            mazeRetrication(empStr + "D", maze, row+1, col);
        }
        if (col < maze[0].length-1) {
            mazeRetrication(empStr+"R", maze, row, col+1);
        }
    }
}
