import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindow_max {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 }; // return max number of every 3 element
        int k = 3;
        // int[] result = slidingWindowMaximu(nums, 3, 0, new int[nums.length - k +1]);
        // System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(slidingDeque(nums, k)));
    }

    public static int[] slidingDeque(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        if (nums.length == 0)
            return result;

        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        while (index < k) {
            // here check queue is not empty and if current ele is greater to the last of
            // queue remove last ele
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[index]) {
                deque.pollLast();
            }
            // otherwise add ele in lasrt postion
            deque.offerLast(index);
            index++;
        }
        result[0] = nums[deque.peekFirst()];

        /*
         * in first window to find maximum after i=1;
         * 0,1,2
         * 1,2,3
         * so 0 index can remove and 3 index is add
         * (remove) i=1 <= i-1 remove all the less index of i
         * (Add) i+k-1 = 1+3-1 = 3 so add 3 index
         */
        for (int i = 1; i <= n - k; i++) {
            // here check queue is not empty and first index of queue is samller then
            // current i remove index in queue
            if (!deque.isEmpty() && deque.peekFirst() < i) {
                deque.pollFirst();
            }

            // here check queue is not empty and if current ele is greater to the last of queue remove last ele
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i + k - 1]) {
                deque.pollLast();
            }
            deque.offerLast(i + k - 1);
            result[i] = nums[deque.peekFirst()];
        }

        return result;
    }

    public static int[] slidingWindowMaximu(int[] nums, int k, int row, int[] result) {
        if (row > nums.length - k) {
            return result;
        }

        int max = Integer.MIN_VALUE;
        for (int i = row; i < row + k; i++) {
            max = Math.max(max, nums[i]);
        }
        result[row] = max;

        return slidingWindowMaximu(nums, k, row + 1, result);

    }

}
