/* in remove duplicat sorted arr ii means
 * only twince are allwoed if same value is three time repeat just ignore
 * so i can maintane use of count reach only 1 menas 1 twince are complete 
 * update the actual arr use of k 
 */

//  Url = https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class RemoveDuplicateSoartedArrII {
    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int k = 1;
        int count = 0;

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                if(count < 1){
                    nums[k++] = nums[i];
                    count++;
                }
            }else{
                nums[k++] = nums[i];
                count = 0;
            }
        }

        return k;
    }
}
