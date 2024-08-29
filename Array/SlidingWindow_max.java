import java.util.Arrays;
import java.util.List;

public class SlidingWindow_max {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};  //return max number of every 3 element
        int k = 3;
        int[] result = slidingWindowMaximu(nums, 3, 0, new int[nums.length - k +1]);
        System.out.println(Arrays.toString(result));
    }

    public static int[] slidingWindowMaximu(int[] nums, int k,int row, int[] result){
        if(row > nums.length-k){
            return result;
        }

        int max = Integer.MIN_VALUE;
        for (int i = row; i < row+k; i++) {
            max = Math.max(max, nums[i]);
        }
        result[row] = max;

        return slidingWindowMaximu(nums, k, row+1, result);

    }

}
