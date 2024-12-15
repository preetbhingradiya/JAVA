/* here evry first grid[0][0] is alwasy 0 
 *  so move to lasr m-1,n-1 for every cell time is 1 sec
 * but condition is time >= cel[i][j]
 * 
 * url = https://leetcode.com/problems/minimum-time-to-visit-a-cell-in-a-grid/description/
 */

import java.util.PriorityQueue;

public class MinimuTimeToVisistToCell{

    private static final int[][] directions = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public static void main(String[] args) {
        int[][] grid = {{0,1,3,2}, {5,1,2,5}, {4,3,8,6}};
        System.out.println(minimumTime(grid));
    }

    public static int minimumTime(int[][] grid) {

        if(grid[1][0] > 1 && grid[0][1] > 1) return -1;

        int m = grid.length;
        int n = grid[0].length;

        boolean [][] visit = new boolean[m][n];

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        queue.add(new int[]{0,0,0}); // cell, row, col

        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            int time = curr[0], row = curr[1], col = curr[2];

            if(row == m-1 && col == n-1) return time;

            if(visit[row][col]) continue;
            visit[row][col] = true;

            for(int[] dir : directions){
                int newRow = row + dir[0], newCol = col + dir[1];
                if(newRow < 0 || newRow > m-1 || newCol < 0 || newCol > n-1 || visit[newRow][newCol]) continue;
                int cycleType = ((grid[newRow][newCol] - time) % 2 == 0) ? 1 : 0;
               queue.add(new int[]{Math.max(grid[newRow][newCol]+ cycleType, time+1), newRow, newCol});
            }
        }
        return -1;
    }
}