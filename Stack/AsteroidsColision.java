/* in this question -(negative number) move left side
+(postive number) move right
any case left -> <- right meet than check which is greater they stack in stack and other remove
in comparise sign are ignore menas not count of  + , - 
EX = 1,-2,10,-5
 1 is postitive blind incerstion = 1
-2 => 2 > 1 so pop 1 and add -2
add 10
-5 => 10 > 5 so ignore -s
ANS = [-2,10]
*/

// url = https://leetcode.com/problems/asteroid-collision/description/

import java.util.Arrays;
import java.util.Stack;

public class AsteroidsColision {

    public static void main(String[] args) {
        int[] arr = {1,-2,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            //if stack is empty or element is positive blind insertion
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]); 
            }else {
                //ele is negative
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    //if current ele and top of stack bot negative add and break;
                    if (top < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }
                    int val = Math.abs(asteroids[i]);
                    if (val == top) { //if both are same
                        stack.pop();
                        break;
                    } else if (val < top) {
                        break;  //peek is greate to current break
                     }else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int n = stack.size();
        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
