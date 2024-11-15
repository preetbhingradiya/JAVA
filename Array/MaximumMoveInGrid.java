/* In this Example every first col menas 0 index element show how many move 
 Element is 2,5,3,10 every row in 0 col
 condition is check current ele is greater than (row - 1, col + 1), (row, col + 1) and (row + 1, col + 1)
 only Three condition is check
 and every point found count and return max
 */

// url = https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/

public class MaximumMoveInGrid {

    public static void main(String[] args) {
        int[][] grid = {{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 1}, {10, 9, 13, 15}};
        System.out.println(maxMoves(grid));
    }

    public static int maxMoves(int[][] grid) {
        int maxCount = 0;

        int m = grid.length;
        int n = grid[0].length;

        int[][] memo = new int[m][n];

        for (int row = 0; row < m; row++) {
            maxCount = Math.max(maxCount, dfs(row, 0, grid, memo));
        }

        return maxCount;
    }

    public static int dfs(int row, int col, int[][] grid, int[][] memo) {
        if (memo[row][col] != 0) {
            return memo[row][col];
        }

        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        if ((row > 0 && col < n - 1) && (grid[row][col] > grid[row - 1][col + 1])) {
            count = Math.max(count, 1 + dfs(row - 1, col + 1, grid, memo));
        }

        if (col < n - 1 && (grid[row][col] > grid[row][col + 1])) {
            count = Math.max(count, 1 + dfs(row, col + 1, grid, memo));
        }

        if ((row < m - 1 && col < n - 1) && (grid[row][col] > grid[row + 1][col + 1])) {
            count = Math.max(count, 1 + dfs(row + 1, col + 1, grid, memo));
        }

        // Store the result in memo for memorizetion
        memo[row][col] = count;
        return count;
    }

}
