/* k size window find every k size sum if any elemet are repeated in k window this is not included
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions */

// url = https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

import java.util.HashMap;
import java.util.Map;

public class MaximumSubarrayWithLengthK {
    
    public static void main(String[] args){
        int[] nums = {1,5,4,2,9,9,9};
        int k = 0;
    }

    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long currentSum =0, maxSum = 0;

        for(int i=0; i<nums.length; i++){
            //store nums value in map with frequence(how many time is repeted)
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
            currentSum += nums[i];

            if(i >= k-1){  // when i is qeual to k-1
                if(map.size() == k) maxSum = Math.max(maxSum, currentSum);  // if map size is k menas no any repeted num

                //here remove last element for sum , decrese frequence , if this 0 remov
                int prev = nums[i-k+1];
                currentSum -= prev;
                map.put(prev, map.get(prev)-1);
                if(map.get(prev)==0) map.remove(prev);
            }
        }   

        return maxSum;
    }

}
