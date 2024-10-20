
/**
 * CountOfMaximumXor
 */
public class CountOfMaximumXor {

    public static void main(String[] args) {

        //All ele of xor is 3|2|1|5 = 6
        // find the all subset that xor is 6
        // - [3,5]
        // - [3,1,5]
        // - [3,2,5]
        // - [3,2,1,5]
        // - [2,5]
        // - [2,1,5]
        int[] nums = {3, 2, 1, 5};

        //find all number of or |
        int targetOr = 0;
        for (int num : nums) {
            targetOr |= num;
        }

        //memorize the ans = index, targetOR
        Integer dp[][] = new Integer[nums.length][targetOr + 1];

        System.out.println(recur(0, nums, 0, targetOr, dp));
    }

    public static int recur(int index, int[] nums, int currOr, int targetOr, Integer dp[][]) {
        //base case
        if (index == nums.length) {
            return (currOr == targetOr) ? 1 : 0;
        }

        if (dp[index][currOr] != null) {
            return dp[index][currOr];
        }

        //pick number
        int pickCount = recur(index + 1, nums, currOr | nums[index], targetOr, dp);

        //no pick number
        int noPickCount = recur(index + 1, nums, currOr, targetOr, dp);

        return dp[index][currOr] = pickCount + noPickCount;
    }
}
