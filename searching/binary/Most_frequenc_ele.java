import java.util.Arrays;

public class Most_frequenc_ele {
    public static void main(String[] args) {
        int nums[] = {1,4,8,13};
        int k =5;
        System.out.println(maxFrequency(nums,k));
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0;
        long result = 0, sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            // sliding windo formula
            while (nums[right] * (right - left + 1L) > sum + k) {
                sum -= nums[left];
                left++;
            }

            result = Math.max(result, right - left + 1L);
            right++;
        }

        return (int) result;
    }
}
