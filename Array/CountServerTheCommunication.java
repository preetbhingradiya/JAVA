/* here server menas  = 1
 * or empty space = 0
 * 
 * here return check multipal (minimum 2) server means 1 are alive in same row or smae colume
 * it means it was comunication eatch
 * 
 * Solution :-  here i can found all 1 and update row and col value
 * After second loop if 1 found than check rowcount > 1 or colcount > 1 any one is grater than 2 so count++
 */


public class CountServerTheCommunication {

    public static void main(String[] args){
        int[][] grid = {{1,1,0,0}, {0,0,1,0}, {0,0,1,0}, {0,0,0,1}};
        SolutionCount sl = new SolutionCount();
        System.out.println(sl.countServers(grid));
    }
    
}


class SolutionCount{
    public static int countServers(int[][] grid){
        int m = grid.length, n = grid[0].length;

        int[] rowCount = new int[m]; // Row array
        int[] colCount = new int[n]; //Col array

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }


        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)){
                    count++;
                }
            }
        }

        return count;
    }
}