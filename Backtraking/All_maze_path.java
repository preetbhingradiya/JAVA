public class All_maze_path {

    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };

        mazeAllPath("", maze, 0, 0);
    }

    static void mazeAllPath(String emptStr, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(emptStr);
            return;
        }

        if (!maze[row][col])
            return;

        // i am considering this block in my corrent path and now it can false
        maze[row][col] = false;

        if (row < maze.length - 1) {
            mazeAllPath(emptStr + "D", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            mazeAllPath(emptStr + "R", maze, row, col + 1);
        }

        if (row > 0) {
            mazeAllPath(emptStr + "U", maze, row - 1, col);
        }

        if (col > 0) {
            mazeAllPath(emptStr + "L", maze, row, col - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
    }

}
