// There are 5 subarrays of nums of size 3:

// [1, 2, 3] with the maximum element 3.
// [2, 3, 4] with the maximum element 4.
// [3, 4, 3] whose elements are not consecutive. -1
// [4, 3, 2] whose elements are not sorted. -1
// [3, 2, 5] whose elements are not consecutive. -1

// url = https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPowerOfKSizeSubArr {

    public static void main(String[] args){
        int nums[] = {1,2,3,4,3,2,5};
        int k = 3;
        System.err.println(Arrays.toString(resultsArray(nums,k)));
    }

     public static int[] resultsArray(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - k + 1; i++) { 
            boolean isConsecutive = true;
            int maxVal = nums[i];

            for (int j = i; j < i + k - 1; j++) {
                // here add 1 in (curr element + 1) and (next element) is same or not if not same means window is not sorted or consecutive so -1
                if (nums[j] + 1 != nums[j + 1]) {
                    isConsecutive = false;
                    break;
                }
                maxVal = Math.max(maxVal, nums[j + 1]);
            }

            ans.add(isConsecutive ? maxVal : -1);
        }

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}