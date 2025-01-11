
import java.util.Arrays;

/* here start for every character check how many posiblity to move 1 in this position
 * suppose "001011" move 2index is 1 from left side count = 2
 * move 4 index is 1 from left side count = 2 + 4 =6
 * move 5 index is 1 from left side cout = 6 + 5 = 11 (0 index output)
 */

public class MinimumNumOfEachBoxToMove {
    public static void main(String[] args){
        String s = "001011";
        int[] ans = minOperations(s);
        System.out.print(Arrays.toString(ans));        
    }

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];

        //not required
        left[0] = 0;
        right[n-1] = 0;

        int count = boxes.charAt(0) - '0';
        for(int i=1; i<n; i++){
            left[i] = left[i-1] + count;
            count += boxes.charAt(i) - '0';
        }

        count = boxes.charAt(n-1) - '0';
        // int prevRight = 0;
        // int currRight = 0;
        for(int i=n-2; i>=0; i--){
            // currRight = prevRight + count;
            // prevRight = currRight; 
            // left[i] = left[i] + currRight;
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
        }

        for(int i=0; i<n; i++){
            res[i] = left[i] + right[i];
        }

        return res;
    }

}
