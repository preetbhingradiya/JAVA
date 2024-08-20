import java.util.ArrayList;

public class Maze_path {
    public static void main(String[] args) {
        // pathOfMaze("", 3, 3);
        System.out.println(mazePathOfList("", 3, 3));
    }

    public static void pathOfMaze(String empStr, int row, int col) {
        if (row == 1 && col == 1) { //both are 1 means you find one posible path
            System.out.println(empStr);
            return;
        }

        if(row > 1){ // if row is 1 means not any ele in down
            pathOfMaze(empStr + "D", row-1, col);//move down side
        }

        if(col > 1){ //if col is 1 means not any ele is right
            pathOfMaze(empStr + "R", row, col-1); //move right side
        }
    }

    public static ArrayList<String> mazePathOfList(String empStr, int row, int col) {
        ArrayList<String> list = new ArrayList<>();
        if (row == 1 && col == 1) { 
            list.add(empStr);
            return list;
        }

        if(row > 1){ 
            list.addAll(mazePathOfList(empStr + "D", row-1, col));
        }

        if(col > 1){ 
            list.addAll(mazePathOfList(empStr + "R", row, col-1)); 
        }

        return list;
    }
}
