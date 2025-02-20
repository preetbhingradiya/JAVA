/* find the pair for product are match for (A, B, C, D)
 * here a*b == c*d than count 1
 * So if any match pair found like a*b == c*d so 8 pair found of 5 elemet
 */

import java.util.HashMap;
import java.util.Map;

public class TrupleSumWithProduct{
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,10};
        System.out.println(tupleSameProduct(nums));
    }

    public static int tupleSameProduct(int[] nums) {
        int ans = 0;
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] * nums[j];
                //Add multiply by 8 beacuse every (a,b,c,d) pair if match than 8 pair are matched
                ans += 8 * map.getOrDefault(sum , 0);

                //updated value of current sum otherwise put 0
                map.put(sum, map.getOrDefault(sum , 0) + 1);
            }
        }

        return ans;
    }
}