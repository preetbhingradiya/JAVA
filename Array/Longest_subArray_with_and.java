//find largest element and check if continues large ele are given then increse count otherwise start count as 0
public class Longest_subArray_with_and {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2};

        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int count = 0;
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                count++; 
            }else {
                count = 0;
            }
            ans = count < ans ? ans : count;
        }

        return ans;

    }
}
