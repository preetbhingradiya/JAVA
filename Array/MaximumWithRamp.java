import java.util.Stack;

/* find the maximu length of array
 * here condition is i < j and nums[i] <= nums[j]
 * index 1 to index 5 = 1 < 5 and nums[1] <= nums[5] = 0 <=5
 */
public class MaximumWithRamp{
    public static void main(String[] args){
        int[] nums = {6,0,8,2,1,5};
       System.out.println(maxWidthRamp(nums)); x
    }

    public static int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            //here stack is empty add first index after that check stack > nums value
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }


        int maxLength = 0;
        for(int j=n-1; j>=0; j--){
            //than traves stack value and nums last check current nums is greate than stack value 
            // find length and pop valu of tha stack
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[j])
                maxLength = Math.max(maxLength, j- stack.pop());

            if(stack.isEmpty()) break;
        }

        return maxLength;
    }
}