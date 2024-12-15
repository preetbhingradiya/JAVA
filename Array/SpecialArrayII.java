/* queries arra is  [[start, end]] index to use in nums
 *  find special suString menans odd, even, odd, even, odd... rang
 * for all queries array to find special substring in nums
 * first count all value and this previous number count 
 * according this end position - start position == 0 ? true ? false
 * 
 * https://leetcode.com/problems/special-array-ii/description/
 */


public class SpecialArrayII{
    public static void main(String[] args) {
        Solution solution = new Solution();

        int []nums = {4,3,1,6};
        int[][] queries = {{0,2}, {2,3}};

        solution.isArraySpecial(nums,queries);
    }
}

class Solution {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] count = new int[n];
        count[0] = 0;
        for(int i=1; i<n; i++){
            int parity = (nums[i] % 2 == nums[i-1] % 2) ? 1 : 0; 
            count[i] = count[i-1] + parity;
        }

        boolean [] res  = new boolean[queries.length];

        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            res[i] = ((count[end] - count[start]) == 0);
        }

        return res;
    }
}