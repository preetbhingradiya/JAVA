/* find the max number in array
 * after 1 to max number run binary search and find mid to check every nums of array
 * if num > mid than apply 2bag formula
 * 
 * url = https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/description/
 */


public class MinimumLimitsOfBallInBag {
    public static void main(String[] args){
        int[] nums = {2,4,8,2};
        int maxOperations = 4;
        System.out.println(minimumSize(nums, maxOperations));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;

        int maxNum = 0;
        for(int num : nums){
            maxNum = Math.max(maxNum, num);
        }

        int left = 1, right = maxNum;
        int result = maxNum;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Calculate the number of operations needed for the mid value
            int operations = 0;
            for (int num : nums) {
                // For each num, calculate how many pieces we need to divide it into
                if (num > mid) {
                    operations += (num - 1) / mid; // This is equivalent to ceil(num / mid) - 1
                }
            }

            // If the number of operations exceeds maxOperations, we need to increase mid
            if (operations > maxOperations) {
                left = mid + 1;
            } else {
                // Otherwise, we try to find a smaller mid that works
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }
}
