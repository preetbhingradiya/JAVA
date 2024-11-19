/*  find the closet classment to mark is smalle to my
InDirect = find next smallest elemt  (NSE)

Url = https://www.geeksforgeeks.org/problems/help-classmates--141631/1
*/

import java.util.Arrays;
import java.util.Stack;

public class HelpClassment {
    
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 25};
        int n = 5;
        System.out.println(Arrays.toString(help_classmate(arr, n)));
    }

    public static int[] help_classmate(int arr[], int n) { 
	    
	    int[] res = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    
	    for(int i=n-1; i>=0; i--){
            //pop operation stil peek is not greater to current or stack is empty
            while(!stack.isEmpty() && stack.peek() >= arr[i]) stack.pop();
            if(stack.isEmpty()) res[i] = -1;
            else res[i] = stack.peek();
            stack.push(arr[i]);
        }
        
        return res;
	} 
}
