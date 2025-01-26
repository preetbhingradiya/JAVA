
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* 1 which means go to the cell to the right. (i.e go from grid[i][j] to grid[i][j + 1])
 * 2 which means go to the cell to the left. (i.e go from grid[i][j] to grid[i][j - 1])
 * 3 which means go to the lower cell. (i.e go from grid[i][j] to grid[i + 1][j])
 * 4 which means go to the upper cell. (i.e go from grid[i][j] to grid[i - 1][j])
 *  
 * https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
 */


public class MinimumCostToMakeOneValidPath {

    public static void main(String[] args){
        int[][] grid = {{1,1,3}, {4,3,2}, {4,2,4}};

        Solution cost = new Solution();
        System.err.println(cost.minCost(grid));
    }
}

class Solution {
    public static  int minCost(int[][] grid) {
       int m =  grid.length, n = grid[0].length;
       int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}}; //left, right, down, up

       int[][] cost = new int[m][n];
       for(int i = 0; i < m; i++)  
            Arrays.fill(cost[i], Integer.MAX_VALUE); //assign all cost as max

       Deque<int[]> dp = new ArrayDeque<>();
       dp.offerFirst(new int[]{0,0}); //start at top left
       cost[0][0] = 0; // no cost at start

       while(!dp.isEmpty()){
            int[] cell = dp.pollFirst() ;
            int x = cell[0],  y = cell[1];

            // Explore all four directions
            for(int i=0; i<dirs.length; i++){
                int nx = x + dirs[i][0]  , ny = y + dirs[i][1];

                // Calculate the new cost to move to the new cell
                int newCost = cost[x][y] + ( i != grid[x][y] - 1 ? 1 : 0);

                // Check if the new cell is within bounds and the 
                //new cost is lower than the current cost
                if( (nx >= 0 && nx < m) && (ny >=0 && ny  < n) && newCost < cost[nx][ny]){
                    cost[nx][ny] = newCost;  //update the cost for the new cell

                    // / If the move was not the expected one (i.e., cost increased), 
                    //add to the back of the deque
                    if(i != grid[x][y] - 1)
                        dp.offerLast(new int[]{nx, ny});
                    else
                        dp.offerFirst(new int[]{nx, ny});
                }
            }
       }

        return cost[m - 1][n - 1];
    }
}
