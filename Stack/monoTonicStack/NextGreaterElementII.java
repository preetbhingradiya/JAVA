/* Find the first seconde largest number but it was circular array
 * means index 4 from value 3 is next largest element is 4
 * so here asume double length of the nums arr to travel
 * first n/2 is in only check the stack.pee() <= nums[i%n] 
 * when n is greater to i i<n than check forther 
 */

// Url = https://leetcode.com/problems/next-greater-element-ii/
import java.util.*;

public class NextGreaterElementII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        int[] res = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) stack.pop();
            if (i < n) {
                if (stack.isEmpty()) res[i] = -1;
                else res[i] = stack.peek();
            }

            stack.push(nums[i % n]);
        }

        return res;
    }
}
