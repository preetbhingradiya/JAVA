/* finde every element height from prev smaller and next smaller
    [2,1,5,6,2,3] 
    2 mate previous smaller -1 AND next index 1
    1 ps -1 AND next index 6 (if no any next smaler)
    5 ps index 1 AND next index 4....
 * NextSmaller = [1, 6, 4, 4, 6, 6]  index
 * PrevSmaller = [-1, -1, 1, 2, 1, 4] index
 * in 2 = 1 - (-1) - 1 = 1 * 2 = 2
 * in 1 = 6 - (-1) - 1 = 6 * 1 = 6
 * in 5 = 4 - (1) - 1 = 2 * 5 = 10
 * in 6 = 4 - 2 - 1 = 1 * 6 = 6
 * in 2 = 6 - 1 - 1 = 4 * 2 = 8
 * in 3 = 6 - 4 + 1 = 3 * 3 =9
 * ANS = 10 max
 */

// URL = https://leetcode.com/problems/largest-rectangle-in-histogram/description/

import java.util.Stack;

public class LargestRectangalHistrogam {

    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        // largestRectangleArea(heights);

        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int element =(i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>element) {
                int h = heights[stack.pop()];
                int ps = (stack.isEmpty())?-1:stack.peek();
                int w = i - ps -1;
                max = Math.max(max, h*w); 
            }
            stack.push(i);
        }

        System.out.println(max == Integer.MIN_VALUE ? 0 : max);
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int nextSmaller[] = findNexSmaller(heights);
        int prevSmaller[] = prevNexSmaller(heights);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int h = heights[i];
            int w = nextSmaller[i] - prevSmaller[i] - 1; //(UP - LL -1)
            max = Math.max(max, (h*w));
        }

        return max;
    }

    public static int[] findNexSmaller(int arr[]) { 
	    
        int n = arr.length;
	    int[] res = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    
	    for(int i=n-1; i>=0; i--){
            //pop operation stil peek is not greater to current or stack is empty
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if(stack.isEmpty()) res[i] = n;
            else res[i] = stack.peek();
            stack.push(i);
        }
        
        return res;
	} 


    public static int[] prevNexSmaller(int arr[]) { 
	    
        int n = arr.length;
	    int[] res = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    
	    for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if(stack.isEmpty()) res[i] = -1;
            else res[i] = stack.peek();
            stack.push(i);
        }
        
        return res;
	} 
}