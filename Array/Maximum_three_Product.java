import java.util.Arrays;

public class Maximum_three_Product {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        Arrays.sort(nums);

        int n = nums.length;

        int one = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int two = nums[0] * nums[1] * nums[n - 1];

        System.out.println(Math.max(one, two));
    }
}
