/* find the shortest path to remove obstacle here obstacle is 1
 *  use of graph and bfs approch
 * first create m*n obstacles to assign max value
 * after create Deque to stor obstac, row, col
 * here {{0,1}, {0,-1}, {1,0}, {-1,0}} this is four direct left = 0,1 right = -1,0
 * down = 1,0 and up = -1,0
 * 
 * in direction loop if find 1 (obstacl) add last from queue otherwise add first
 * 
 * url = https://leetcode.com/problems/minimum-obstacle-removal-to-reach-corner/description/
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class MiniObstacleRemovalReachCorner {
    private static final int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public static void main(String[] args){
        int[][ ] grid = {{0,1,1}, {1,1,0}, {1,1,0}};
        System.out.println(minimumObstacles(grid));
    }   
    

    public static int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] obstacles = new int[m][n];

        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                obstacles[i][j] = Integer.MAX_VALUE;


        obstacles[0][0] = 0;
        Deque<int[]> dqueue = new ArrayDeque<>();
        dqueue.add(new int[]{0,0,0});  //obstacl, row, col

        while(!dqueue.isEmpty()){
            int[] curr = dqueue.poll();
            int obs = curr[0], row = curr[1], col = curr[2];
            if(row == m-1 && col == n-1) return obs;

            for(int[] dir : directions){
                int newRow = row + dir[0], newCol = col + dir[1];
                if((newRow >= 0 && newCol >= 0) && (newRow < m && newCol < n) && obstacles[newRow][newCol] == Integer.MAX_VALUE){ //not visited the current row,col
                    if(grid[newRow][newCol] == 1){  // find obstacle add in last in deque
                        obstacles[newRow][newCol] = obs+1;
                        dqueue.addLast(new int[] {obs + 1, newRow, newCol});
                    }else{
                        obstacles[newRow][newCol] = obs;
                        dqueue.addFirst(new int[] {obs , newRow, newCol});
                    }
                }
            }

        }

        return -1;
    }
}
