/* here question said is Fisher can catch the maximum fish??
 * fish value is > 0 
 * and all 0 reprasend the land so fisher can move 0 value row
 * so use of bfs and travel all row*col grid and catch fish
 * if one time fish are catch add in visited
 * 
 * https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/description/
 */


public class MaximumNumberFishInAGrid {
    private static int rows;
    private static int cols;
    public static void main(String[] args){
        int[][] grid = {{0,2,1,0},{4,0,0,3},{1,0,0,4},{0,3,2,0}};
        findMaxFish(grid);
    }


    public static int findMaxFish(int[][] grid) {
         rows = grid.length;
         cols = grid[0].length;
        int maxFishes=0;
        //find max of all components
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    maxFishes=Math.max(maxFishes, dfs(i,j,grid));
                }
            }
        }
        return maxFishes;
    }
    public static int dfs(int r, int c, int grid[][]){
        if(r<0 || r>=rows || c<0 || c>= cols || grid[r][c] == 0){
            return 0;
        }
        int ans = grid[r][c];
        grid[r][c] = 0;
        ans += dfs(r-1,c,grid) + dfs(r,c+1,grid) + dfs(r+1,c,grid) + dfs(r,c-1,grid);
        return ans;
    }


    // public static int findMaxFish(int[][] grid) {
    //     int m = grid.length, n = grid[0].length;

    //     boolean[][] visited = new boolean[m][n]; 
    //     int maxSum = 0;

    //     // DFS helper method to explore the connected fish
    //     // for up, right, down, left directions
    //     int[] directions = {-1, 0, 1, 0, -1}; 

    //     for (int row = 0; row < m; row++) {
    //         for (int col = 0; col < n; col++) {
    //             if (grid[row][col] == 0 || visited[row][col]) continue;

    //             // Start DFS to sum up all connected fish
    //             int currFish = dfs(grid, row, col, visited, directions, m, n);

    //             maxSum = Math.max(maxSum, currFish);
    //         }
    //     }

    //     return maxSum;
    // }

    // private static int dfs(int[][] grid, int row, int col, boolean[][] visited, int[] directions, int m, int n) {
    //     if (row < 0 || row >= m || col < 0 || col >= n || visited[row][col] || grid[row][col] == 0) {
    //         return 0; 
    //     }

    //     visited[row][col] = true;  // Mark the current cell as visited
    //     int currentFish = grid[row][col];

    //     for (int i = 0; i < 4; i++) {
    //         int newRow = row + directions[i];
    //         int newCol = col + directions[i + 1];

    //         currentFish += dfs(grid, newRow, newCol, visited, directions, m, n); // Accumulate fish from connected cells
    //     }

    //     return currentFish; 
    // }
}