/* n == nums.length
 1 <= n <= 16
 nums[i].length == n
 nums[i] is either '0' or '1'.
 All the strings of nums are unique.

 find the unique binary string that are not present in nums if one string find return that
 * 
 */

import java.util.HashSet;

public class FindBinaryUniqueString {
    static String res;
    static HashSet<String> set;
    public static void main(String[] args) {
        String [] nums ={"111","011","001"};
        res = "";
        int n = nums.length;
        set = new HashSet<>();

        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);

        backtracking(n, nums, new StringBuilder());

        System.out.println(res);
    }

    private static Boolean backtracking(int n, String[] nums, StringBuilder curr){
        if(curr.length() == n){
            if(!set.contains(curr.toString())){
                res = curr.toString();
                return true;
            }
            return false    ;
        }

        // Try appending '0'recurse
        // curr.append('0');
        // if (backtracking(n, nums, curr)) return true;
        // curr.deleteCharAt(curr.length() - 1);

        // Try appending '1'recurse
        // curr.append('1');
        // if (backtracking(n, nums, curr)) return true;
        // curr.deleteCharAt(curr.length() - 1); 
        for(char ch='0'; ch<='1'; ch++){
            curr.append(ch);
            if (backtracking(n, nums, curr)) return true;
            curr.deleteCharAt(curr.length() - 1); 
        }
        
        return false;
    }
}
